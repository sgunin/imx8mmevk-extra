FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI_append_imx8mmevkit += " \
	file://imx8mmevk.dts;subdir=git/arch/${ARCH}/boot/dts/freescale \
	file://imx8mm.dtsi;subdir=git/arch/${ARCH}/boot/dts/freescale \
	"
