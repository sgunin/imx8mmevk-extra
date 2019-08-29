FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI_append_imx8mmevkit += " \
	file://imx8mmevk.dts;subdir=git/arch/${ARCH}/boot/dts/freescale \
	file://imx8mm.dtsi;subdir=git/arch/${ARCH}/boot/dts/freescale \
<<<<<<< HEAD
=======
	file://0001-dts-makefile.patch \
>>>>>>> b4fecb4e421696e4e16569820ab15c79c6b33d8c
	"
