package com.google.android.gms.mdm.services;

import android.app.admin.DevicePolicyManager;
import android.location.Location;
import defpackage.cctl;
import defpackage.ccto;
import defpackage.ccuo;
import defpackage.cczv;
import defpackage.cdab;
import defpackage.cdac;
import defpackage.cdag;
import defpackage.cdah;
import defpackage.enqb;
import defpackage.enre;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.fihr;
import defpackage.fihs;
import defpackage.fiib;
import defpackage.ikd;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocateChimeraService extends ccuo {
    public static final /* synthetic */ int h = 0;

    public LocateChimeraService() {
        super(cctl.a());
    }

    @Override // defpackage.ccuo
    protected final enss a(fiib fiibVar, Location location) {
        fihr fihrVar;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        Collection<cdag> values = cdah.a().a.values();
        boolean z = fiibVar == fiib.USER_NOT_PRIVILEGED || fiibVar == fiib.FIND_MY_DEVICE_DISABLED;
        if (values == null) {
            return ensm.a;
        }
        ArrayList arrayList = new ArrayList(values.size());
        for (cdag cdagVar : values) {
            ccto cctoVar = this.e;
            fiib[] fiibVarArr = {fiibVar};
            fihs fihsVar = null;
            if (!cdagVar.b || z) {
                fihrVar = null;
            } else {
                fihrVar = cdac.a(this);
            }
            if (cdagVar.c && !z) {
                fihsVar = cdab.b(this);
            }
            arrayList.add(cctoVar.a(fiibVarArr, location, fihrVar, fihsVar, cdagVar.a, cczv.b(devicePolicyManager), cdab.a(this)));
        }
        return ensj.a(arrayList).b(new enqb() { // from class: ccuv
            @Override // defpackage.enqb
            public final enss a() {
                return ensm.a;
            }
        }, enre.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    @Override // defpackage.ccuo
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

    @Override // defpackage.ccuo
    protected final void f(ikd ikdVar) {
        ikdVar.B();
    }
}
