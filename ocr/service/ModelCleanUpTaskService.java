package com.google.android.gms.ocr.service;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.csku;
import defpackage.effv;
import defpackage.eite;
import defpackage.eitj;
import defpackage.ennt;
import defpackage.enpf;
import defpackage.ensj;
import defpackage.fnbr;
import defpackage.fqor;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ModelCleanUpTaskService extends GmsTaskBoundService {
    public static void d(byjl byjlVar, int[] iArr, int i) {
        long a = fqor.a.a().a();
        long j = a / 2;
        Bundle bundle = new Bundle();
        if (fnbr.a.a().ac()) {
            int i2 = 0;
            for (int i3 : iArr) {
                i2 |= i3;
            }
            bundle.putInt("clean_up_type", i2);
        } else {
            bundle.putIntArray("clean_up_type", iArr);
        }
        bundle.putInt("model_type", i);
        bykj bykjVar = new bykj();
        bykjVar.w(ModelCleanUpTaskService.class.getName());
        bykjVar.e(j, a);
        bykjVar.g(2);
        bykjVar.u = bundle;
        bykjVar.t("type_".concat(String.valueOf(Arrays.toString(iArr))));
        bykjVar.v(1);
        byjlVar.f(bykjVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        Bundle bundle = bylnVar.b;
        if (bundle == null) {
            Log.e("CCOCR2.service", "Null clean up task params.");
            return 2;
        }
        int[] intArray = bundle.getIntArray("clean_up_type");
        if (intArray != null) {
            effv a = csku.a(bundle.getInt("model_type"));
            int i = eitj.d;
            eite eiteVar = new eite();
            if (ennt.k(intArray, 1)) {
                eiteVar.i(a.b());
            }
            if (ennt.k(intArray, 2)) {
                eiteVar.i(a.a());
            }
            if (ennt.k(intArray, 4)) {
                eiteVar.i(a.e());
            }
            eitj g = eiteVar.g();
            if (g.isEmpty()) {
                return 2;
            }
            try {
                ((enpf) ensj.e(g)).u();
                return 0;
            } catch (InterruptedException | ExecutionException e) {
                Log.e("CCOCR2.service", "", e);
            }
        } else {
            int i2 = bundle.getInt("clean_up_type", 0);
            effv a2 = csku.a(bundle.getInt("model_type"));
            int i3 = eitj.d;
            eite eiteVar2 = new eite();
            if ((i2 & 1) != 0) {
                eiteVar2.i(a2.b());
            }
            if ((i2 & 2) != 0) {
                eiteVar2.i(a2.a());
            }
            if ((i2 & 4) != 0) {
                eiteVar2.i(a2.e());
            }
            eitj g2 = eiteVar2.g();
            if (g2.isEmpty()) {
                return 2;
            }
            try {
                ((enpf) ensj.e(g2)).u();
                return 0;
            } catch (InterruptedException | ExecutionException e2) {
                Log.e("CCOCR2.service", "", e2);
            }
        }
        return 2;
    }
}
