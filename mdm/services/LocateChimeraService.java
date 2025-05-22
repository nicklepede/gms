package com.google.android.gms.mdm.services;

import android.app.admin.DevicePolicyManager;
import android.location.Location;
import defpackage.cfcf;
import defpackage.cfci;
import defpackage.cfdi;
import defpackage.cfiv;
import defpackage.cfjb;
import defpackage.cfjc;
import defpackage.cfjg;
import defpackage.cfjh;
import defpackage.eqdu;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.fkxo;
import defpackage.fkxp;
import defpackage.fkxy;
import defpackage.ilt;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocateChimeraService extends cfdi {
    public static final /* synthetic */ int h = 0;

    public LocateChimeraService() {
        super(cfcf.a());
    }

    @Override // defpackage.cfdi
    protected final eqgl a(fkxy fkxyVar, Location location) {
        fkxo fkxoVar;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        Collection<cfjg> values = cfjh.a().a.values();
        boolean z = fkxyVar == fkxy.USER_NOT_PRIVILEGED || fkxyVar == fkxy.FIND_MY_DEVICE_DISABLED;
        if (values == null) {
            return eqgf.a;
        }
        ArrayList arrayList = new ArrayList(values.size());
        for (cfjg cfjgVar : values) {
            cfci cfciVar = this.e;
            fkxy[] fkxyVarArr = {fkxyVar};
            fkxp fkxpVar = null;
            if (!cfjgVar.b || z) {
                fkxoVar = null;
            } else {
                fkxoVar = cfjc.a(this);
            }
            if (cfjgVar.c && !z) {
                fkxpVar = cfjb.b(this);
            }
            arrayList.add(cfciVar.a(fkxyVarArr, location, fkxoVar, fkxpVar, cfjgVar.a, cfiv.b(devicePolicyManager), cfjb.a(this)));
        }
        return eqgc.a(arrayList).b(new eqdu() { // from class: cfdp
            @Override // defpackage.eqdu
            public final eqgl a() {
                return eqgf.a;
            }
        }, eqex.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    @Override // defpackage.cfdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void c(android.content.Intent r8) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdm.services.LocateChimeraService.c(android.content.Intent):void");
    }

    @Override // defpackage.cfdi
    protected final void f(ilt iltVar) {
        iltVar.C();
    }
}
