DESCRIPTION = "Console image for imx8MM Development board"
LICENSE = "MIT"
# http://www.informit.com/articles/article.aspx?p=2514911

inherit core-image
inherit extrausers

EXTRA_USERS_PARAMS = " \
        useradd -m -U -P ${EXTRA_ROOT_PWD} -G sudo sg; \
        usermod -P ${EXTRA_ROOT_PWD} root; \
        "

GLIBC_GENERATE_LOCALES = "en_GB.UTF-8 en_US.UTF-8"
IMAGE_LINGUAS ?= "en-us"
LIMIT_BUILT_LOCALES ?= "POSIX en_GB"
#DEFAULT_TIMEZONE=”Europe/Moscow”

# Add aditional 5Gb free space to RootFS
IMAGE_ROOTFS_EXTRA_SPACE = "5242880"

IMAGE_FEATURES += " \
    package-management \
    post-install-logging \
    nfs-client \
    hwcodecs \
"

IMAGE_INSTALL += " \
    ssh-fixes \
    zip \
    opkg \
    openssh \
    openssh-keygen \
    openssh-sftp-server \
    tzdata \
    htop \
    gpsd \
    gps-utils \
    curl \
    sudo \
    screen \
    cpufrequtils \
    ntp \
    procps \
    cronie \
    minicom \
    kernel-devicetree \
    kernel-modules \
    coreutils \
    mtd-utils \
    ldd \
    libstdc++ \
    openssh-sftp \
    ppp \
    rng-tools \
    util-linux \
    tslib \
    tslib-calibrate \
    tslib-conf \
    tslib-dev \
    tslib-tests \
    crda \
    iw \
    wpa-supplicant \
    bluez5 \
    wpa-supplicant-passphrase \
    wpa-supplicant-cli \
    iproute2 \
    iproute2-tc \
    rsync \
    gstreamer1.0-rtsp-server \
    gst-variable-rtsp-server \
    packagegroup-base-extended \
    packagegroup-core-full-cmdline \
    packagegroup-core-ssh-openssh \
    packagegroup-tools-bluetooth \
    packagegroup-fsl-tools-audio \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-gstreamer1.0-full \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston-init', '', d)} \
"

TOOLCHAIN_HOST_TASK_append = " nativesdk-cmake"
