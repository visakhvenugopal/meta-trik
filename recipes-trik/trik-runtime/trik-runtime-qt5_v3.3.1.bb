TRIK_RUNTIME_UPDATE = "2"
PR="r${TRIK_RUNTIME_UPDATE}"
require trik-runtime-qt5.inc
DEPENDS += "nanomsg python3"
RDEPENDS_${PN} += "nanomsg"

#OE_QMAKE_CXXFLAGS_append += " -fno-lto"

#We need to switch precompiled headers off until this issue is fixed in trik-runtime sources
EXTRA_QMAKEVARS_PRE += " -r CONFIG+=noPch "

# For script gathering logs information
RDEPENDS_${PN} += "bash xz"
# Commented out, because trik-pythonqt is compiled into trik-runtime as git submodule
#RRECOMMENDS_${PN} += "trik-pythonqt"
#INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
#INHIBIT_PACKAGE_STRIP = "1"
#DEBUG_BUILD = "1"
