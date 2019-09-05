DESCRIPTION = "Debug version of console image for imx8MM Development board"

require console-image.bb

IMAGE_FEATURES += " \
    tools-debug \
    tools-profile \
    tools-testapps \
    eclipse-debug \
    dev-pkgs \
    doc-pkgs \
"
IMAGE_INSTALL += " \
    strace \
    i2c-tools \
    memtester \
    sysbench \
    devmem2 \
    libstdc++-dev \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    packagegroup-core-buildessential \
    packagegroup-core-tools-debug \
    gst-examples \
"
