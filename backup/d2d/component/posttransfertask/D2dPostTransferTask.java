package com.google.android.gms.backup.d2d.component.posttransfertask;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ajwt;
import defpackage.akjy;
import defpackage.akwl;
import defpackage.aszs;
import defpackage.atad;
import defpackage.auad;
import defpackage.cauf;
import defpackage.cvmr;
import defpackage.eaie;
import defpackage.ekvl;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class D2dPostTransferTask extends GmsTaskBoundService {
    private static final auad a = ajwt.a("D2dPostTransferTask");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        eaie eaieVar;
        String str = caufVar.a;
        if (!Objects.equals(str, "WalletRestore")) {
            a.m("Unsupported task tag %s", str);
            return 2;
        }
        auad auadVar = akjy.a;
        ekvl.b(Objects.equals(str, "WalletRestore"), "Received invalid task tag");
        Bundle bundle = caufVar.b;
        if (bundle == null || bundle.isEmpty()) {
            akjy.a.m("No task extras", new Object[0]);
            return 2;
        }
        byte[] byteArray = bundle.getByteArray("wallet_restore_request");
        if (byteArray == null) {
            akjy.a.m("Missing wallet restore request", new Object[0]);
            return 2;
        }
        auad auadVar2 = akwl.a;
        try {
            fgri y = fgri.y(eaie.a, byteArray, 0, byteArray.length, fgqp.a());
            fgri.M(y);
            eaieVar = (eaie) y;
        } catch (fgsd unused) {
            akwl.a.m("Could not parse Pay request object", new Object[0]);
            eaieVar = null;
        }
        if (eaieVar == null) {
            akjy.a.m("Malformed wallet restore request", new Object[0]);
            return 2;
        }
        aszs aszsVar = cvmr.a;
        if (akwl.b(eaieVar, new atad((Context) this, (byte[][][]) null)) != null) {
            return 0;
        }
        akjy.a.m("Failure while running Pay restore API; rescheduling", new Object[0]);
        return 1;
    }
}
