package com.google.android.gms.backup.d2d.component.posttransfertask;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ahwd;
import defpackage.aiji;
import defpackage.aivv;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.arxo;
import defpackage.byln;
import defpackage.ctdm;
import defpackage.dxwd;
import defpackage.eiig;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class D2dPostTransferTask extends GmsTaskBoundService {
    private static final arxo a = ahwd.a("D2dPostTransferTask");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        dxwd dxwdVar;
        String str = bylnVar.a;
        if (!Objects.equals(str, "WalletRestore")) {
            a.m("Unsupported task tag %s", str);
            return 2;
        }
        arxo arxoVar = aiji.a;
        eiig.b(Objects.equals(str, "WalletRestore"), "Received invalid task tag");
        Bundle bundle = bylnVar.b;
        if (bundle == null || bundle.isEmpty()) {
            aiji.a.m("No task extras", new Object[0]);
            return 2;
        }
        byte[] byteArray = bundle.getByteArray("wallet_restore_request");
        if (byteArray == null) {
            aiji.a.m("Missing wallet restore request", new Object[0]);
            return 2;
        }
        arxo arxoVar2 = aivv.a;
        try {
            fecp y = fecp.y(dxwd.a, byteArray, 0, byteArray.length, febw.a());
            fecp.M(y);
            dxwdVar = (dxwd) y;
        } catch (fedk unused) {
            aivv.a.m("Could not parse Pay request object", new Object[0]);
            dxwdVar = null;
        }
        if (dxwdVar == null) {
            aiji.a.m("Malformed wallet restore request", new Object[0]);
            return 2;
        }
        aqxd aqxdVar = ctdm.a;
        if (aivv.b(dxwdVar, new aqxo((Context) this, (byte[][][]) null)) != null) {
            return 0;
        }
        aiji.a.m("Failure while running Pay restore API; rescheduling", new Object[0]);
        return 1;
    }
}
