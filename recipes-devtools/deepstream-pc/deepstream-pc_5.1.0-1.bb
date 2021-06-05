DESCRIPTION = "NVIDIA Deepstream SDK pkg-config support"
LICENSE = "CLOSED"

SRC_URI = "file://deepstream-5.1.pc"

S = "${WORKDIR}"

do_install_append() {
        install -d ${D}"${libdir}/pkgconfig"
        install -m 0644 ${WORKDIR}/deepstream-5.1.pc ${D}${libdir}/pkgconfig
}

FILES_${PN} += "${libdir}/pkgconfig/*"

