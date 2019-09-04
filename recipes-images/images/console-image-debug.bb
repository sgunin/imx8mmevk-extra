DESCRIPTION = "Debug version of console image for imx8MM Development board"

require console-image.bb

EXTRA_IMAGE_FEATURES += " \
    tools-debug \
    eclipse-debug \
"

IMAGE_FEATURES += " \
    tools-profile \
    tools-debug \
    tools-testapps \
"

IMAGE_INSTALL += " \
    i2c-tools \
    memtester \
    sysbench \
    devmem2 \
    gdbserver \
    libstdc++-dev \
    "

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
"
