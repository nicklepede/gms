package com.google.android.gms.constellation.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.auad;
import defpackage.auio;
import defpackage.aupz;
import defpackage.avdl;
import defpackage.avdr;
import defpackage.avdt;
import defpackage.avpa;
import defpackage.avpz;
import defpackage.avqa;
import defpackage.avqe;
import defpackage.avqj;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.ekvk;
import defpackage.ekww;
import defpackage.eqju;
import defpackage.eqjw;
import defpackage.fmer;
import defpackage.fpdm;
import defpackage.rxx;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ConstellationOnDemandConsentChimeraActivity extends rxx {
    public static final auad j = avqj.a("on_demand_consent");
    private avdt p;
    private String q;
    private String r;
    private final ExecutorService m = new aupz(1, 9);
    public final UUID k = UUID.randomUUID();
    private boolean n = false;
    private boolean o = false;
    public int l = 0;

    public final boolean a(String str) {
        return getIntent().getBooleanExtra(str, false);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void finish() {
        eqju eqjuVar;
        avdr avdrVar;
        int i;
        if (this.l == -1 && TextUtils.isEmpty(this.r)) {
            this.l = 7;
        }
        j.d("Finishing with result code: %d", Integer.valueOf(this.l));
        Intent intent = new Intent();
        avpz a = avpz.a(this);
        avdr avdrVar2 = avdr.FAILED;
        int i2 = this.l;
        if (i2 == -1) {
            String str = this.q;
            boolean z = str != null && str.equals("CONSENTED");
            intent.putExtra("account_name_key", this.r);
            intent.putExtra("consent_status_key", (z ? fmer.CONSENTED : fmer.NO_CONSENT).a());
            a.M(this.k, eqjw.OD_CONSENT, getCallingPackage(), true != z ? 16 : 15);
            avdrVar = z ? avdr.CONSENTED : avdr.SKIPPED;
        } else {
            if (i2 == 0) {
                avdrVar2 = avdr.CANCELED;
            }
            UUID uuid = this.k;
            eqjw eqjwVar = eqjw.OD_CONSENT;
            String callingPackage = getCallingPackage();
            switch (this.l) {
                case 1:
                    eqjuVar = eqju.OD_CONSENT_NOT_ENABLED;
                    break;
                case 2:
                    eqjuVar = eqju.OD_CONSENT_NO_NETWORK;
                    break;
                case 3:
                    eqjuVar = eqju.OD_CONSENT_ALREADY_CONSENTED;
                    break;
                case 4:
                    eqjuVar = eqju.OD_CONSENT_NO_DEFAULT_ACCOUNT;
                    break;
                case 5:
                    eqjuVar = eqju.OD_CONSENT_WILL_ANNOY_USER;
                    break;
                case 6:
                    eqjuVar = eqju.UNKNOWN_ERROR;
                    break;
                case 7:
                    eqjuVar = eqju.OD_CONSENT_ACCOUNT_NAME_MISSING;
                    break;
                case 8:
                    eqjuVar = eqju.OD_CONSENT_EMPTY;
                    break;
                case 9:
                    eqjuVar = eqju.OD_CONSENT_CALLING_PACKAGE_NOT_ALLOWED;
                    break;
                default:
                    eqjuVar = eqju.OD_CONSENT_CANCELED;
                    break;
            }
            a.k(uuid, eqjwVar, callingPackage, eqjuVar);
            avdrVar = avdrVar2;
        }
        if (this.o && (i = this.l) != 9) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    avdt avdtVar = this.p;
                    if (avdtVar != null) {
                        try {
                            avdtVar.e(avdrVar, getCallingPackage());
                            break;
                        } catch (avqe e) {
                            j.g("Error storing impression", e, new Object[0]);
                            break;
                        }
                    }
                    break;
            }
        }
        setResult(this.l, intent);
        super.finish();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final String getCallingPackage() {
        return ekvk.b(super.getCallingPackage());
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1) {
                if (intent != null) {
                    this.r = intent.getStringExtra("authAccount");
                    String stringExtra = intent.getStringExtra("result.consent_result_key");
                    this.q = stringExtra;
                    if (!TextUtils.isEmpty(stringExtra)) {
                        j.d("Webview resulted ok, accountName: %s, status: %s", ekvk.b(this.r), ekvk.b(this.q));
                        this.l = -1;
                    }
                    finish();
                }
                i2 = -1;
            }
            if (i2 == -1) {
                j.d("Webview resulted ok without any output", new Object[0]);
                this.l = 8;
            } else if (i2 == 0) {
                j.d("Webview resulted canceled", new Object[0]);
                this.l = 0;
            }
            finish();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        avdt avdtVar;
        super.onCreate(bundle);
        this.n = fpdm.e();
        fpdm fpdmVar = fpdm.a;
        this.o = fpdmVar.lK().l();
        getApplicationContext();
        ekww ekwwVar = bsxv.a;
        bsxr.a(auio.CONSTELLATION_UI_ONDEMAND_CONSENT);
        if (!fpdm.f()) {
            this.l = 1;
        } else if (fpdmVar.lK().f().b.contains(getCallingPackage())) {
            avpa.a(this);
            if (avpa.b(this)) {
                if (this.o) {
                    try {
                        avdl.b();
                        this.p = avdl.c(this, 1);
                        if (this.n && ((!a("bypass_annoyance_check_key") || !fpdm.a.lK().e().b.contains(getCallingPackage())) && (avdtVar = this.p) != null)) {
                            try {
                                if (avdtVar.a(fpdm.b()) >= fpdm.c()) {
                                    this.l = 5;
                                }
                            } catch (avqe e) {
                                j.g("Error accessing impressions", e, new Object[0]);
                                this.l = 6;
                            }
                        }
                    } catch (avqa unused) {
                        this.l = 1;
                    }
                }
                String languageTag = Locale.getDefault().toLanguageTag();
                fpdm fpdmVar2 = fpdm.a;
                final String uri = Uri.parse(fpdmVar2.lK().g()).buildUpon().appendQueryParameter("continue", Uri.parse(fpdmVar2.lK().h()).buildUpon().appendQueryParameter("hl", languageTag).build().toString()).appendQueryParameter("hl", languageTag).build().toString();
                j.j("Loading URL: %s", uri);
                this.m.execute(new Runnable() { // from class: aveu
                    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 307
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.aveu.run():void");
                    }
                });
                return;
            }
            this.l = 2;
        } else {
            this.l = 9;
        }
        finish();
    }
}
