FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI_append_imx8mmevkit += " \
	file://imx8mmevk.dts;subdir=git/arch/arm/dts \
	file://imx8mm.dtsi;subdir=git/arch/arm/dts \
	file://0001-dts-makefile.patch \
	file://imx8mmevkit_defconfig;subdir=git/configs \
	"
