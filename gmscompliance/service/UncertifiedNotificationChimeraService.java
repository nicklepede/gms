package com.google.android.gms.gmscompliance.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.gmscompliance.AppContextProvider;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.anxo;
import defpackage.aquo;
import defpackage.arsm;
import defpackage.asbo;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.dfee;
import defpackage.ejhf;
import defpackage.fnfa;
import defpackage.foku;
import defpackage.fokx;
import defpackage.ikb;
import defpackage.ikd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class UncertifiedNotificationChimeraService extends GmsTaskChimeraService {
    private static final asot a = asot.b("UncertifiedNotificationSvc", asej.GMS_COMPLIANCE);
    private asbo b;

    private final asbo e() {
        if (this.b == null) {
            this.b = asbo.f(this);
        }
        return this.b;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        GmsDeviceComplianceResponse gmsDeviceComplianceResponse;
        if (!fnfa.c()) {
            return 0;
        }
        e().o("UncertifiedNotificationChimeraService", 1, dfee.AUTH_ACCOUNT_UNCERTIFIED_PROVISIONAL);
        foku fokuVar = foku.a;
        long k = fokuVar.a().k();
        Bundle bundle = null;
        Bundle bundle2 = foku.c() ? bylnVar.b : null;
        if (!foku.c() || bundle2 == null) {
            gmsDeviceComplianceResponse = null;
        } else {
            gmsDeviceComplianceResponse = new GmsDeviceComplianceResponse();
            gmsDeviceComplianceResponse.d = bundle2.getBoolean("AUTH_IS_PROVISIONAL");
            gmsDeviceComplianceResponse.e = bundle2.getLong("AUTH_PROVISIONAL_EXPIRATION");
        }
        if (gmsDeviceComplianceResponse != null) {
            k = gmsDeviceComplianceResponse.e;
        }
        long currentTimeMillis = k - System.currentTimeMillis();
        if (currentTimeMillis <= 0) {
            d(0L);
            return 0;
        }
        if (currentTimeMillis > 604800000) {
            ((ejhf) ((ejhf) a.i()).ah((char) 5050)).z("[UncertifiedDevice, UncertifiedNotificationChimeraService] UncertifiedNotificationChimeraService should not be triggered when remaining days to expire registration is %d or more days.", 7);
            return 0;
        }
        d(currentTimeMillis);
        if (foku.c()) {
            bundle = new Bundle();
            bundle.putBoolean("AUTH_IS_PROVISIONAL", gmsDeviceComplianceResponse.d);
            bundle.putLong("AUTH_PROVISIONAL_EXPIRATION", gmsDeviceComplianceResponse.e);
        }
        long j = (currentTimeMillis % 86400000) / 1000;
        long j2 = fokuVar.a().j() + j;
        bykj bykjVar = new bykj();
        bykjVar.e(j, j2);
        bykjVar.t("UncertifiedNotificationTask");
        bykjVar.j = "com.google.android.gms.gmscompliance.service.UncertifiedNotificationService";
        bykjVar.g(2);
        bykjVar.p = true;
        bykjVar.v(1);
        bykjVar.u = bundle;
        byjl.a(this).f(bykjVar.b());
        return 0;
    }

    final void d(long j) {
        String quantityString;
        String str;
        Intent intent = new Intent("android.intent.action.VIEW");
        String c = !aquo.e(AppContextProvider.a()) ? null : arsm.c(AppContextProvider.a(), "auth_uncertified_notification_url");
        if (c == null) {
            fokx.c();
            c = "https://support.google.com/googleplay/?p=uncertified_registration";
        }
        intent.setData(Uri.parse(c));
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        if (j <= 0) {
            str = getResources().getString(R.string.uncertified_notification_expired_title);
            quantityString = getResources().getString(R.string.uncertified_notification_expired_content);
        } else {
            long j2 = j / 86400000;
            int i = j % 86400000 > 0 ? 1 : 0;
            String string = getResources().getString(R.string.uncertified_notification_expiring_title);
            int i2 = ((int) j2) + i;
            quantityString = getResources().getQuantityString(R.plurals.uncertified_notification_expiring_content, i2, Integer.valueOf(i2));
            str = string;
        }
        ikd ikdVar = new ikd(this);
        ikdVar.m(str);
        ikdVar.l(quantityString);
        ikdVar.g(anxo.a(this, 2131233569));
        ikdVar.r(true);
        ikb ikbVar = new ikb();
        ikbVar.d(quantityString);
        ikdVar.v(ikbVar);
        ikdVar.l = 2;
        ikdVar.g = activity;
        e().w("UncertifiedNotificationChimeraService", 1, dfee.AUTH_ACCOUNT_UNCERTIFIED_PROVISIONAL, ikdVar.b());
    }
}
