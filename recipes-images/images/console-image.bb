DESCRIPTION = "Console image for imx8MM Development board"
LICENSE = "MIT"

inherit core-image
inherit extrausers

EXTRA_USERS_PARAMS = " \
        useradd -m -U -P ${EXTRA_ROOT_PWD} -G sudo sg; \
        usermod -P ${EXTRA_ROOT_PWD} root; \
        "

GLIBC_GENERATE_LOCALES = "en_GB.UTF-8 en_US.UTF-8"
IMAGE_LINGUAS ?= "en-gb"
LIMIT_BUILT_LOCALES ?= "POSIX en_GB"

IMAGE_FEATURES += " \
    package-management \
    ssh-server-openssh \
    debug-tweaks \
    splash \
    nfs-server \
    ssh-server-dropbear \
    hwcodecs \
"

IMAGE_INSTALL += " \
    ssh-fixes \
    openssh \
    openssh-keygen \
    openssh-sftp-server \
    tzdata \
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
    "

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-tools-bluetooth \
    packagegroup-fsl-tools-audio \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-gstreamer1.0-full \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston-init', '', d)} \
"

TOOLCHAIN_HOST_TASK_append = " nativesdk-cmake"
