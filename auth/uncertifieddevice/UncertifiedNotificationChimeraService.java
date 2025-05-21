package com.google.android.gms.auth.uncertifieddevice;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.anxo;
import defpackage.asbo;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.bykk;
import defpackage.byln;
import defpackage.dfee;
import defpackage.dvni;
import defpackage.fkdo;
import defpackage.fkib;
import defpackage.fkkz;
import defpackage.fkls;
import defpackage.fnfa;
import defpackage.foku;
import defpackage.ikb;
import defpackage.ikd;
import defpackage.vfv;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UncertifiedNotificationChimeraService extends GmsTaskChimeraService {
    private asbo a;

    static Bundle d(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        if (!foku.c()) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("AUTH_IS_PROVISIONAL", gmsDeviceComplianceResponse.d);
        bundle.putLong("AUTH_PROVISIONAL_EXPIRATION", gmsDeviceComplianceResponse.e);
        return bundle;
    }

    static bykk e(long j, long j2, Bundle bundle) {
        bykj bykjVar = new bykj();
        bykjVar.e(j, j2);
        bykjVar.t("UncertifiedNotificationTask");
        bykjVar.j = "com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationService";
        bykjVar.g(2);
        bykjVar.p = true;
        bykjVar.v(1);
        bykjVar.u = bundle;
        return bykjVar.b();
    }

    public static boolean g(boolean z, long j) {
        return !z || j - System.currentTimeMillis() > 604800000;
    }

    private final asbo h() {
        if (this.a == null) {
            this.a = asbo.f(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!fnfa.c()) {
            h().o("UncertifiedNotificationChimeraService", 1, dfee.AUTH_ACCOUNT_UNCERTIFIED_PROVISIONAL);
            dvni dvniVar = vfv.a;
            long b = fkib.b();
            GmsDeviceComplianceResponse gmsDeviceComplianceResponse = null;
            Bundle bundle = foku.c() ? bylnVar.b : null;
            if (foku.c() && bundle != null) {
                gmsDeviceComplianceResponse = new GmsDeviceComplianceResponse();
                gmsDeviceComplianceResponse.d = bundle.getBoolean("AUTH_IS_PROVISIONAL");
                gmsDeviceComplianceResponse.e = bundle.getLong("AUTH_PROVISIONAL_EXPIRATION");
            }
            if (gmsDeviceComplianceResponse != null) {
                b = gmsDeviceComplianceResponse.e;
            }
            long currentTimeMillis = b - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                f(0L);
            } else if (currentTimeMillis <= 604800000) {
                f(currentTimeMillis);
                long j = (currentTimeMillis % 86400000) / 1000;
                byjl.a(this).f(e(j, fkkz.h() + j, d(gmsDeviceComplianceResponse)));
            } else {
                Log.e("Auth", String.format(Locale.US, "[UncertifiedDevice, UncertifiedNotificationChimeraService] UncertifiedNotificationChimeraService should not be triggered when remaining days to expire registration is 7 or more days.", new Object[0]));
            }
        }
        return 0;
    }

    final void f(long j) {
        String str;
        String quantityString;
        String str2;
        Intent intent = new Intent("android.intent.action.VIEW");
        dvni dvniVar = vfv.a;
        if (fkdo.h()) {
            str = vfv.l("uncertified_notification_url");
            if (str == null) {
                fkls.c();
                str = "https://support.google.com/googleplay/?p=uncertified_registration";
            }
        } else {
            str = (String) vfv.C.b();
        }
        intent.setData(Uri.parse(str));
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        if (j <= 0) {
            str2 = getResources().getString(R.string.uncertified_notification_expired_title);
            quantityString = getResources().getString(R.string.uncertified_notification_expired_content);
        } else {
            long j2 = j / 86400000;
            int i = j % 86400000 > 0 ? 1 : 0;
            String string = getResources().getString(R.string.uncertified_notification_expiring_title);
            int i2 = ((int) j2) + i;
            quantityString = getResources().getQuantityString(R.plurals.uncertified_notification_expiring_content, i2, Integer.valueOf(i2));
            str2 = string;
        }
        ikd ikdVar = new ikd(this);
        ikdVar.m(str2);
        ikdVar.l(quantityString);
        ikdVar.g(anxo.a(this, 2131233569));
        ikdVar.r(true);
        ikb ikbVar = new ikb();
        ikbVar.d(quantityString);
        ikdVar.v(ikbVar);
        ikdVar.l = 2;
        ikdVar.g = activity;
        h().w("UncertifiedNotificationChimeraService", 1, dfee.AUTH_ACCOUNT_UNCERTIFIED_PROVISIONAL, ikdVar.b());
    }
}
