package com.google.android.gms.ocr.service;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.cutz;
import defpackage.ehsy;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.eqbm;
import defpackage.eqcy;
import defpackage.eqgc;
import defpackage.fptq;
import defpackage.ftio;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ModelCleanUpTaskService extends GmsTaskBoundService {
    public static void d(casd casdVar, int[] iArr, int i) {
        long a = ftio.a.lK().a();
        long j = a / 2;
        Bundle bundle = new Bundle();
        if (fptq.a.lK().ac()) {
            int i2 = 0;
            for (int i3 : iArr) {
                i2 |= i3;
            }
            bundle.putInt("clean_up_type", i2);
        } else {
            bundle.putIntArray("clean_up_type", iArr);
        }
        bundle.putInt("model_type", i);
        catb catbVar = new catb();
        catbVar.w(ModelCleanUpTaskService.class.getName());
        catbVar.e(j, a);
        catbVar.g(2);
        catbVar.u = bundle;
        catbVar.t("type_".concat(String.valueOf(Arrays.toString(iArr))));
        catbVar.v(1);
        casdVar.f(catbVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        Bundle bundle = caufVar.b;
        if (bundle == null) {
            Log.e("CCOCR2.service", "Null clean up task params.");
            return 2;
        }
        int[] intArray = bundle.getIntArray("clean_up_type");
        if (intArray != null) {
            ehsy a = cutz.a(bundle.getInt("model_type"));
            int i = elgo.d;
            elgj elgjVar = new elgj();
            if (eqbm.k(intArray, 1)) {
                elgjVar.i(a.b());
            }
            if (eqbm.k(intArray, 2)) {
                elgjVar.i(a.a());
            }
            if (eqbm.k(intArray, 4)) {
                elgjVar.i(a.e());
            }
            elgo g = elgjVar.g();
            if (g.isEmpty()) {
                return 2;
            }
            try {
                ((eqcy) eqgc.e(g)).u();
                return 0;
            } catch (InterruptedException | ExecutionException e) {
                Log.e("CCOCR2.service", "", e);
            }
        } else {
            int i2 = bundle.getInt("clean_up_type", 0);
            ehsy a2 = cutz.a(bundle.getInt("model_type"));
            int i3 = elgo.d;
            elgj elgjVar2 = new elgj();
            if ((i2 & 1) != 0) {
                elgjVar2.i(a2.b());
            }
            if ((i2 & 2) != 0) {
                elgjVar2.i(a2.a());
            }
            if ((i2 & 4) != 0) {
                elgjVar2.i(a2.e());
            }
            elgo g2 = elgjVar2.g();
            if (g2.isEmpty()) {
                return 2;
            }
            try {
                ((eqcy) eqgc.e(g2)).u();
                return 0;
            } catch (InterruptedException | ExecutionException e2) {
                Log.e("CCOCR2.service", "", e2);
            }
        }
        return 2;
    }
}
