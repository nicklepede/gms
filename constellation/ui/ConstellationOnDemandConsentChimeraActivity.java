package com.google.android.gms.constellation.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.asmf;
import defpackage.aszi;
import defpackage.aszo;
import defpackage.aszq;
import defpackage.atkx;
import defpackage.atlw;
import defpackage.atlx;
import defpackage.atmb;
import defpackage.atmg;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.eiif;
import defpackage.eijr;
import defpackage.enwb;
import defpackage.enwd;
import defpackage.fjou;
import defpackage.fmlr;
import defpackage.qet;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ConstellationOnDemandConsentChimeraActivity extends qet {
    public static final arxo j = atmg.a("on_demand_consent");
    private aszq p;
    private String q;
    private String r;
    private final ExecutorService m = new asmf(1, 9);
    public final UUID k = UUID.randomUUID();
    private boolean n = false;
    private boolean o = false;
    public int l = 0;

    public final boolean a(String str) {
        return getIntent().getBooleanExtra(str, false);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void finish() {
        enwb enwbVar;
        aszo aszoVar;
        int i;
        if (this.l == -1 && TextUtils.isEmpty(this.r)) {
            this.l = 7;
        }
        j.d("Finishing with result code: %d", Integer.valueOf(this.l));
        Intent intent = new Intent();
        atlw a = atlw.a(this);
        aszo aszoVar2 = aszo.FAILED;
        int i2 = this.l;
        if (i2 == -1) {
            String str = this.q;
            boolean z = str != null && str.equals("CONSENTED");
            intent.putExtra("account_name_key", this.r);
            intent.putExtra("consent_status_key", (z ? fjou.CONSENTED : fjou.NO_CONSENT).a());
            a.M(this.k, enwd.OD_CONSENT, getCallingPackage(), true != z ? 16 : 15);
            aszoVar = z ? aszo.CONSENTED : aszo.SKIPPED;
        } else {
            if (i2 == 0) {
                aszoVar2 = aszo.CANCELED;
            }
            UUID uuid = this.k;
            enwd enwdVar = enwd.OD_CONSENT;
            String callingPackage = getCallingPackage();
            switch (this.l) {
                case 1:
                    enwbVar = enwb.OD_CONSENT_NOT_ENABLED;
                    break;
                case 2:
                    enwbVar = enwb.OD_CONSENT_NO_NETWORK;
                    break;
                case 3:
                    enwbVar = enwb.OD_CONSENT_ALREADY_CONSENTED;
                    break;
                case 4:
                    enwbVar = enwb.OD_CONSENT_NO_DEFAULT_ACCOUNT;
                    break;
                case 5:
                    enwbVar = enwb.OD_CONSENT_WILL_ANNOY_USER;
                    break;
                case 6:
                    enwbVar = enwb.UNKNOWN_ERROR;
                    break;
                case 7:
                    enwbVar = enwb.OD_CONSENT_ACCOUNT_NAME_MISSING;
                    break;
                case 8:
                    enwbVar = enwb.OD_CONSENT_EMPTY;
                    break;
                case 9:
                    enwbVar = enwb.OD_CONSENT_CALLING_PACKAGE_NOT_ALLOWED;
                    break;
                default:
                    enwbVar = enwb.OD_CONSENT_CANCELED;
                    break;
            }
            a.k(uuid, enwdVar, callingPackage, enwbVar);
            aszoVar = aszoVar2;
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
                    aszq aszqVar = this.p;
                    if (aszqVar != null) {
                        try {
                            aszqVar.e(aszoVar, getCallingPackage());
                            break;
                        } catch (atmb e) {
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

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final String getCallingPackage() {
        return eiif.b(super.getCallingPackage());
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1) {
                if (intent != null) {
                    this.r = intent.getStringExtra("authAccount");
                    String stringExtra = intent.getStringExtra("result.consent_result_key");
                    this.q = stringExtra;
                    if (!TextUtils.isEmpty(stringExtra)) {
                        j.d("Webview resulted ok, accountName: %s, status: %s", eiif.b(this.r), eiif.b(this.q));
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

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        aszq aszqVar;
        super.onCreate(bundle);
        this.n = fmlr.e();
        fmlr fmlrVar = fmlr.a;
        this.o = fmlrVar.a().l();
        getApplicationContext();
        eijr eijrVar = bqqe.a;
        bqqa.a(aseu.CONSTELLATION_UI_ONDEMAND_CONSENT);
        if (!fmlr.f()) {
            this.l = 1;
        } else if (fmlrVar.a().f().b.contains(getCallingPackage())) {
            atkx.a(this);
            if (atkx.b(this)) {
                if (this.o) {
                    try {
                        aszi.b();
                        this.p = aszi.c(this, 1);
                        if (this.n && ((!a("bypass_annoyance_check_key") || !fmlr.a.a().e().b.contains(getCallingPackage())) && (aszqVar = this.p) != null)) {
                            try {
                                if (aszqVar.a(fmlr.b()) >= fmlr.c()) {
                                    this.l = 5;
                                }
                            } catch (atmb e) {
                                j.g("Error accessing impressions", e, new Object[0]);
                                this.l = 6;
                            }
                        }
                    } catch (atlx unused) {
                        this.l = 1;
                    }
                }
                String languageTag = Locale.getDefault().toLanguageTag();
                final String uri = Uri.parse(fmlr.a.a().g()).buildUpon().appendQueryParameter("continue", Uri.parse(fmlr.a.a().h()).buildUpon().appendQueryParameter("hl", languageTag).build().toString()).appendQueryParameter("hl", languageTag).build().toString();
                j.j("Loading URL: %s", uri);
                this.m.execute(new Runnable() { // from class: atar
                    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 309
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.atar.run():void");
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
