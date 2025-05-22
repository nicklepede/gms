package com.google.android.gms.nearby.mediums.nearfieldcommunication;

import com.google.android.chimera.HostApduService;
import defpackage.bsk;
import defpackage.bsl;
import defpackage.clno;
import defpackage.clpd;
import defpackage.clxk;
import defpackage.clxl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NfcAdvertisingChimeraService extends HostApduService {
    public volatile clxk a;

    private final boolean a() {
        return this.a != null;
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        bsk bskVar = new bsk((bsl) clxl.b().c());
        while (bskVar.hasNext()) {
            byte[] bArr = (byte[]) bskVar.next();
            sb.append("{ ");
            sb.append(clpd.h(bArr));
            sb.append(" } ");
        }
        printWriter.println(String.format("NfcAdvertisingService { hasSocketConnection=%s, advertisements=%s }", Boolean.valueOf(a()), sb));
    }

    @Override // com.google.android.chimera.HostApduService
    public final void onDeactivated(int i) {
        clno.a.b().h("Remote NFC device has disconnected: %s.", String.format(Locale.ENGLISH, "[%d]%s", Integer.valueOf(i), i != 0 ? i != 1 ? "UNKNOWN" : "DEACTIVATION_DESELECTED" : "DEACTIVATION_LINK_LOSS"));
        clpd.A(this.a, "NFC", "NfcAdvertisingSocket");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0122  */
    @Override // com.google.android.chimera.HostApduService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] processCommandApdu(byte[] r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService.processCommandApdu(byte[], android.os.Bundle):byte[]");
    }
}
