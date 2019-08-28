FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI_append_imx8mmevkit += " \
        file://0001-fsl-dtb-hardcoded.patch \
        "
