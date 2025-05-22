package com.google.android.gms.auth.folsom.ui;

import android.app.KeyguardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import com.google.android.gms.auth.folsom.ui.GenericChimeraActivity;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.admk;
import defpackage.adnf;
import defpackage.adng;
import defpackage.auad;
import defpackage.auio;
import defpackage.bolz;
import defpackage.boma;
import defpackage.bomc;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.ekvk;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.elgo;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.eluo;
import defpackage.empz;
import defpackage.emqb;
import defpackage.emqc;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fnqg;
import defpackage.fnqk;
import defpackage.fnqn;
import defpackage.iri;
import defpackage.itk;
import defpackage.itt;
import defpackage.jvr;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.ryb;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GenericChimeraActivity extends ryb {
    public static final elgx h;
    public static final elgo i;
    private static final auad l;
    public int j;
    public String k;

    static {
        elgt elgtVar = new elgt();
        elgtVar.i(1, new itt() { // from class: admo
            @Override // defpackage.itt
            public final Object a() {
                return new adlv();
            }
        });
        elgtVar.i(2, new itt() { // from class: admp
            @Override // defpackage.itt
            public final Object a() {
                return new adla();
            }
        });
        elgtVar.i(4, new itt() { // from class: admq
            @Override // defpackage.itt
            public final Object a() {
                return new adlc();
            }
        });
        elgtVar.i(3, new itt() { // from class: admr
            @Override // defpackage.itt
            public final Object a() {
                return new adlf();
            }
        });
        elgtVar.i(5, new itt() { // from class: adms
            @Override // defpackage.itt
            public final Object a() {
                return new adlr();
            }
        });
        h = elgtVar.b();
        i = elgo.o(1, 2, 4, 5);
        l = adng.a("GenericChimeraActivity");
    }

    public static Intent j(String str, String str2, boolean z, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("account_name", str);
        bundle.putString("security_domain", str2);
        bundle.putInt("operation", 2);
        bundle.putBoolean("local_key_available", z);
        bundle.putString("session_id", str3);
        return new Intent().setClassName(AppContextProvider.a(), m()).setAction("com.google.android.gms.auth.folsom.DegradedRecoverabilityFix").putExtras(bundle).setData(Uri.parse(String.format(Locale.US, "intent://com.google.android.gms.auth.folsom.ui.GenericChimeraActivity/%s/%s/%d", str, str2, 2)));
    }

    public static Intent k(String str, String str2, int i2, boolean z, String str3, boolean z2) {
        AppContextProvider.a();
        if (fnqg.a.lK().d() && !str2.equals("hw_protected")) {
            z2 = true;
        }
        if (fnqn.a.lK().C()) {
            AppContextProvider.a();
        }
        Bundle bundle = new Bundle();
        bundle.putString("account_name", str);
        bundle.putString("security_domain", str2);
        bundle.putInt("operation", 1);
        bundle.putInt("domain_recoverability", i2);
        bundle.putBoolean("local_key_available", z);
        bundle.putString("session_id", str3);
        bundle.putBoolean("offer_reset", z2);
        return new Intent().setClassName(AppContextProvider.a(), m()).setAction("com.google.android.gms.auth.folsom.StartKeyRetrieval").putExtras(bundle).setData(Uri.parse(String.format(Locale.US, "intent://com.google.android.gms.auth.folsom.ui.GenericChimeraActivity/%s/%s/%d", str, str2, 1)));
    }

    public static Intent l(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("account_name", str);
        bundle.putString("security_domain", str2);
        bundle.putInt("operation", 5);
        bundle.putString("session_id", str3);
        return new Intent().setClassName(AppContextProvider.a(), m()).setAction("com.google.android.gms.auth.folsom.LskfConsent").putExtras(bundle).setData(Uri.parse(String.format(Locale.US, "intent://com.google.android.gms.auth.folsom.ui.GenericChimeraActivity/%s/%s/%d", str, str2, 5)));
    }

    public static String m() {
        AppContextProvider.a();
        return "com.google.android.gms.auth.folsom.ui.GenericActivity";
    }

    public final String n() {
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("security_domain");
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        l.d("onBackPressed", new Object[0]);
        adnf.j(n(), this.j, 7, this.k);
        super.onBackPressed();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        boolean z;
        int i2;
        char c;
        char c2;
        ?? r5;
        super.onCreate(bundle);
        this.j = getIntent().getIntExtra("operation", 0);
        String stringExtra = getIntent().getStringExtra("session_id");
        if (stringExtra != null) {
            this.k = stringExtra;
        } else {
            this.k = UUID.randomUUID().toString();
        }
        auad auadVar = l;
        auadVar.h("Starting activity: %s", this.k);
        if (bundle == null) {
            AppContextProvider.a();
            ekww ekwwVar = bsxv.a;
            bsxr.a(auio.AUTH_FOLSOM_KEY_RETRIEVAL);
            Intent intent = getIntent();
            Intent intent2 = getIntent();
            String stringExtra2 = intent2 == null ? null : intent2.getStringExtra("account_name");
            String n = n();
            c = 65535;
            if (this.j != 1 || intent == null || ekvk.c(stringExtra2) || ekvk.c(n)) {
                z = true;
                i2 = 4;
                c2 = 2;
                adnf.j(n(), this.j, 8, this.k);
            } else {
                boolean booleanExtra = intent.getBooleanExtra("local_key_available", false);
                int intExtra = intent.getIntExtra("domain_recoverability", 0);
                boolean booleanExtra2 = intent.getBooleanExtra("is_inline_lskf_consent_possible", false);
                String n2 = n();
                c2 = 2;
                int i3 = this.j;
                z = true;
                String str = this.k;
                int i4 = adnf.a;
                fgrc v = emqc.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                emqc emqcVar = (emqc) fgriVar;
                emqcVar.c = 4;
                i2 = 4;
                emqcVar.b |= 1;
                if (!fgriVar.L()) {
                    v.U();
                }
                fgri fgriVar2 = v.b;
                emqc emqcVar2 = (emqc) fgriVar2;
                emqcVar2.h = 16;
                emqcVar2.b |= 128;
                if (!fgriVar2.L()) {
                    v.U();
                }
                fgri fgriVar3 = v.b;
                emqc emqcVar3 = (emqc) fgriVar3;
                emqcVar3.i = 7;
                emqcVar3.b |= 256;
                if (!fgriVar3.L()) {
                    v.U();
                }
                fgri fgriVar4 = v.b;
                emqc emqcVar4 = (emqc) fgriVar4;
                str.getClass();
                emqcVar4.b |= 1048576;
                emqcVar4.u = str;
                int a = emqb.a(i3);
                if (a != 0) {
                    if (!fgriVar4.L()) {
                        v.U();
                    }
                    emqc emqcVar5 = (emqc) v.b;
                    emqcVar5.n = a - 1;
                    emqcVar5.b |= 8192;
                }
                adnf.o(v, n2);
                fgrc v2 = empz.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                fgri fgriVar5 = v2.b;
                empz empzVar = (empz) fgriVar5;
                empzVar.b |= 1;
                empzVar.c = booleanExtra;
                if (!fgriVar5.L()) {
                    v2.U();
                }
                fgri fgriVar6 = v2.b;
                empz empzVar2 = (empz) fgriVar6;
                empzVar2.b |= 2;
                empzVar2.d = intExtra;
                if (!fgriVar6.L()) {
                    v2.U();
                }
                empz empzVar3 = (empz) v2.b;
                empzVar3.b |= 4;
                empzVar3.e = booleanExtra2;
                if (!v.b.L()) {
                    v.U();
                }
                emqc emqcVar6 = (emqc) v.b;
                empz empzVar4 = (empz) v2.Q();
                empzVar4.getClass();
                emqcVar6.t = empzVar4;
                emqcVar6.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                adnf.n(v);
            }
        } else {
            z = true;
            i2 = 4;
            c = 65535;
            c2 = 2;
        }
        if (fnqk.d()) {
            int i5 = iri.a;
        }
        if (fnqk.c()) {
            setTheme(R.style.folsomActivityDayNightTheme);
        } else {
            setTheme(R.style.folsomActivityTheme);
        }
        String action = getIntent().getAction();
        if (action == null || action.isEmpty()) {
            auadVar.f("Missing action", new Object[0]);
            setResult(0);
            finish();
            return;
        }
        int i6 = iri.a;
        final admk admkVar = (admk) new jxw(this).a(admk.class);
        jvr jvrVar = admkVar.c;
        jvrVar.g(this, new jvs() { // from class: adml
            @Override // defpackage.jvs
            public final void a(Object obj) {
                int intValue = ((Integer) obj).intValue();
                GenericChimeraActivity genericChimeraActivity = GenericChimeraActivity.this;
                admk admkVar2 = (admk) new jxw(genericChimeraActivity).a(admk.class);
                if (((Integer) admkVar2.f.d).intValue() == 8) {
                    if (intValue == -1) {
                        admkVar2.e(5);
                        adnf.h(genericChimeraActivity.n(), 6, genericChimeraActivity.k);
                        return;
                    }
                    adnf.h(genericChimeraActivity.n(), 7, genericChimeraActivity.k);
                }
                if (intValue == -1) {
                    adnf.j(genericChimeraActivity.n(), genericChimeraActivity.j, 2, genericChimeraActivity.k);
                }
                genericChimeraActivity.setResult(intValue);
                genericChimeraActivity.finish();
            }
        });
        admkVar.d.g(this, new jvs() { // from class: admm
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ew gY = GenericChimeraActivity.this.gY();
                itt ittVar = (itt) GenericChimeraActivity.h.get((Integer) obj);
                if (ittVar == null) {
                    return;
                }
                bp bpVar = new bp(gY);
                bpVar.G(R.anim.folsom_slide_in, R.anim.folsom_slide_out);
                bpVar.z(R.id.fragment, (dg) ittVar.a(), "nativeview_fragment");
                bpVar.a();
            }
        });
        admkVar.e.g(this, new jvs() { // from class: admn
            @Override // defpackage.jvs
            public final void a(Object obj) {
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                if (GenericChimeraActivity.i.contains(num)) {
                    GenericChimeraActivity genericChimeraActivity = GenericChimeraActivity.this;
                    ew gY = genericChimeraActivity.gY();
                    admz admzVar = (admz) genericChimeraActivity.gY().h("webview_fragment");
                    if (admzVar == null) {
                        Intent intent3 = genericChimeraActivity.getIntent();
                        String stringExtra3 = intent3.getStringExtra("account_name");
                        ekvl.y(stringExtra3);
                        String stringExtra4 = intent3.getStringExtra("security_domain");
                        ekvl.y(stringExtra4);
                        String str2 = genericChimeraActivity.k;
                        admz admzVar2 = new admz();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("account_name", stringExtra3);
                        bundle2.putString("security_domain", stringExtra4);
                        bundle2.putInt("operation", intValue);
                        bundle2.putString("session_id", str2);
                        admzVar2.setArguments(bundle2);
                        admzVar = admzVar2;
                    }
                    bp bpVar = new bp(gY);
                    bpVar.G(R.anim.folsom_slide_in, R.anim.folsom_slide_out);
                    bpVar.z(R.id.fragment, admzVar, "webview_fragment");
                    bpVar.a();
                }
            }
        });
        Intent intent3 = getIntent();
        String str2 = this.k;
        String stringExtra3 = intent3.getStringExtra("account_name");
        ekvl.y(stringExtra3);
        admkVar.h = stringExtra3;
        String stringExtra4 = intent3.getStringExtra("security_domain");
        ekvl.y(stringExtra4);
        admkVar.g = stringExtra4;
        admkVar.j = intent3.getBooleanExtra("is_inline_lskf_consent_possible", false);
        admkVar.k = intent3.getStringExtra("utm_source");
        admkVar.l = intent3.getStringExtra("utm_medium");
        admkVar.m = intent3.getStringExtra("utm_campaign");
        admkVar.i = intent3.getBooleanExtra("local_key_available", false);
        intent3.getIntExtra("operation", 0);
        admkVar.o = intent3.getBooleanExtra("offer_reset", false);
        admkVar.n = str2;
        int i7 = boma.f;
        bolz bolzVar = new bolz();
        switch (action.hashCode()) {
            case -2063871434:
                if (action.equals("com.google.android.gms.auth.folsom.LskfConsent")) {
                    r5 = c2;
                    break;
                }
                r5 = c;
                break;
            case -235208065:
                if (action.equals("com.google.android.gms.auth.folsom.DegradedRecoverabilityFix")) {
                    r5 = 3;
                    break;
                }
                r5 = c;
                break;
            case -226309247:
                if (action.equals("com.google.android.gms.auth.folsom.InitialPasswordEnrollment")) {
                    r5 = z;
                    break;
                }
                r5 = c;
                break;
            case -63347659:
                if (action.equals("com.google.android.gms.auth.folsom.StartKeyRetrieval")) {
                    r5 = 0;
                    break;
                }
                r5 = c;
                break;
            default:
                r5 = c;
                break;
        }
        if (r5 == 0) {
            bolzVar.a = 6;
            bolzVar.c(6, new bomc() { // from class: adlw
                @Override // defpackage.bomc
                public final eqgl a() {
                    return admk.this.a(1);
                }
            });
        } else if (r5 == z) {
            bolzVar.a = 7;
            bolzVar.c(7, new bomc() { // from class: admc
                @Override // defpackage.bomc
                public final eqgl a() {
                    return admk.this.a(4);
                }
            });
        } else if (r5 == c2) {
            bolzVar.a = 1;
            bolzVar.c(1, new bomc() { // from class: admd
                @Override // defpackage.bomc
                public final eqgl a() {
                    KeyguardManager keyguardManager = (KeyguardManager) AppContextProvider.a().getSystemService("keyguard");
                    admk admkVar2 = admk.this;
                    if (keyguardManager != null && keyguardManager.isDeviceSecure()) {
                        return admkVar2.f.b(2);
                    }
                    adnf.h(admkVar2.g, 8, admkVar2.n);
                    admkVar2.d.ih(1);
                    return admkVar2.f.a();
                }
            });
            bolzVar.c(2, new bomc() { // from class: adme
                @Override // defpackage.bomc
                public final eqgl a() {
                    admk admkVar2 = admk.this;
                    admkVar2.d.ih(2);
                    return admkVar2.f.a();
                }
            });
            bolzVar.c(Integer.valueOf(i2), new bomc() { // from class: admf
                @Override // defpackage.bomc
                public final eqgl a() {
                    admk admkVar2 = admk.this;
                    admkVar2.d.ih(4);
                    return admkVar2.f.a();
                }
            });
        } else {
            if (r5 != 3) {
                ((eluo) admk.a.j()).B("Unexpected action: %s", action);
                jvrVar.l(0);
                setContentView(R.layout.webview_activity);
                admkVar.f.i();
            }
            if (Objects.equals(admkVar.g, "chromesync")) {
                bolzVar.a = 8;
                bolzVar.c(8, new bomc() { // from class: admg
                    @Override // defpackage.bomc
                    public final eqgl a() {
                        return admk.this.a(2);
                    }
                });
                bolzVar.c(5, new bomc() { // from class: admh
                    @Override // defpackage.bomc
                    public final eqgl a() {
                        admk admkVar2 = admk.this;
                        admkVar2.d.ih(5);
                        return admkVar2.f.a();
                    }
                });
            } else {
                bolzVar.a = 3;
                bolzVar.c(3, new bomc() { // from class: admi
                    @Override // defpackage.bomc
                    public final eqgl a() {
                        admk admkVar2 = admk.this;
                        admkVar2.d.ih(3);
                        return admkVar2.f.a();
                    }
                });
                bolzVar.c(8, new bomc() { // from class: adlx
                    @Override // defpackage.bomc
                    public final eqgl a() {
                        return admk.this.a(2);
                    }
                });
                bolzVar.c(5, new bomc() { // from class: admh
                    @Override // defpackage.bomc
                    public final eqgl a() {
                        admk admkVar2 = admk.this;
                        admkVar2.d.ih(5);
                        return admkVar2.f.a();
                    }
                });
            }
        }
        bolzVar.e(new Runnable() { // from class: adma
            @Override // java.lang.Runnable
            public final void run() {
                admk.this.c.ih(-1);
            }
        });
        bolzVar.f(new itk() { // from class: admb
            @Override // defpackage.itk
            public final void a(Object obj) {
                admk.this.c.ih(0);
            }
        });
        admkVar.f = bolzVar.a();
        setContentView(R.layout.webview_activity);
        admkVar.f.i();
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            l.d("Home button pressed", new Object[0]);
            adnf.j(n(), this.j, 7, this.k);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
