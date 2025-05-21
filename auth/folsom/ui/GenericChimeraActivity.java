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
import defpackage.abmk;
import defpackage.abnf;
import defpackage.abng;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.bmfh;
import defpackage.bmfi;
import defpackage.bmfk;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.eiif;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.eitj;
import defpackage.eito;
import defpackage.eits;
import defpackage.ejhf;
import defpackage.ekcn;
import defpackage.ekcp;
import defpackage.ekcq;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkyz;
import defpackage.fkzd;
import defpackage.fkzg;
import defpackage.ips;
import defpackage.iru;
import defpackage.isd;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qex;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GenericChimeraActivity extends qex {
    public static final eits h;
    public static final eitj i;
    private static final arxo l;
    public int j;
    public String k;

    static {
        eito eitoVar = new eito();
        eitoVar.i(1, new isd() { // from class: abmo
            @Override // defpackage.isd
            public final Object a() {
                return new ablv();
            }
        });
        eitoVar.i(2, new isd() { // from class: abmp
            @Override // defpackage.isd
            public final Object a() {
                return new abla();
            }
        });
        eitoVar.i(4, new isd() { // from class: abmq
            @Override // defpackage.isd
            public final Object a() {
                return new ablc();
            }
        });
        eitoVar.i(3, new isd() { // from class: abmr
            @Override // defpackage.isd
            public final Object a() {
                return new ablf();
            }
        });
        eitoVar.i(5, new isd() { // from class: abms
            @Override // defpackage.isd
            public final Object a() {
                return new ablr();
            }
        });
        h = eitoVar.b();
        i = eitj.o(1, 2, 4, 5);
        l = abng.a("GenericChimeraActivity");
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
        if (fkyz.a.a().d() && !str2.equals("hw_protected")) {
            z2 = true;
        }
        if (fkzg.a.a().C()) {
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

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        l.d("onBackPressed", new Object[0]);
        abnf.j(n(), this.j, 7, this.k);
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
    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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
        arxo arxoVar = l;
        arxoVar.h("Starting activity: %s", this.k);
        if (bundle == null) {
            AppContextProvider.a();
            eijr eijrVar = bqqe.a;
            bqqa.a(aseu.AUTH_FOLSOM_KEY_RETRIEVAL);
            Intent intent = getIntent();
            Intent intent2 = getIntent();
            String stringExtra2 = intent2 == null ? null : intent2.getStringExtra("account_name");
            String n = n();
            c = 65535;
            if (this.j != 1 || intent == null || eiif.c(stringExtra2) || eiif.c(n)) {
                z = true;
                i2 = 4;
                c2 = 2;
                abnf.j(n(), this.j, 8, this.k);
            } else {
                boolean booleanExtra = intent.getBooleanExtra("local_key_available", false);
                int intExtra = intent.getIntExtra("domain_recoverability", 0);
                boolean booleanExtra2 = intent.getBooleanExtra("is_inline_lskf_consent_possible", false);
                String n2 = n();
                c2 = 2;
                int i3 = this.j;
                z = true;
                String str = this.k;
                int i4 = abnf.a;
                fecj v = ekcq.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                ekcq ekcqVar = (ekcq) fecpVar;
                ekcqVar.c = 4;
                i2 = 4;
                ekcqVar.b |= 1;
                if (!fecpVar.L()) {
                    v.U();
                }
                fecp fecpVar2 = v.b;
                ekcq ekcqVar2 = (ekcq) fecpVar2;
                ekcqVar2.h = 16;
                ekcqVar2.b |= 128;
                if (!fecpVar2.L()) {
                    v.U();
                }
                fecp fecpVar3 = v.b;
                ekcq ekcqVar3 = (ekcq) fecpVar3;
                ekcqVar3.i = 7;
                ekcqVar3.b |= 256;
                if (!fecpVar3.L()) {
                    v.U();
                }
                fecp fecpVar4 = v.b;
                ekcq ekcqVar4 = (ekcq) fecpVar4;
                str.getClass();
                ekcqVar4.b |= 1048576;
                ekcqVar4.u = str;
                int a = ekcp.a(i3);
                if (a != 0) {
                    if (!fecpVar4.L()) {
                        v.U();
                    }
                    ekcq ekcqVar5 = (ekcq) v.b;
                    ekcqVar5.n = a - 1;
                    ekcqVar5.b |= 8192;
                }
                abnf.o(v, n2);
                fecj v2 = ekcn.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                fecp fecpVar5 = v2.b;
                ekcn ekcnVar = (ekcn) fecpVar5;
                ekcnVar.b |= 1;
                ekcnVar.c = booleanExtra;
                if (!fecpVar5.L()) {
                    v2.U();
                }
                fecp fecpVar6 = v2.b;
                ekcn ekcnVar2 = (ekcn) fecpVar6;
                ekcnVar2.b |= 2;
                ekcnVar2.d = intExtra;
                if (!fecpVar6.L()) {
                    v2.U();
                }
                ekcn ekcnVar3 = (ekcn) v2.b;
                ekcnVar3.b |= 4;
                ekcnVar3.e = booleanExtra2;
                if (!v.b.L()) {
                    v.U();
                }
                ekcq ekcqVar6 = (ekcq) v.b;
                ekcn ekcnVar4 = (ekcn) v2.Q();
                ekcnVar4.getClass();
                ekcqVar6.t = ekcnVar4;
                ekcqVar6.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                abnf.n(v);
            }
        } else {
            z = true;
            i2 = 4;
            c = 65535;
            c2 = 2;
        }
        if (fkzd.c()) {
            setTheme(R.style.folsomActivityDayNightTheme);
        } else {
            setTheme(R.style.folsomActivityTheme);
        }
        String action = getIntent().getAction();
        if (action == null || action.isEmpty()) {
            arxoVar.f("Missing action", new Object[0]);
            setResult(0);
            finish();
            return;
        }
        int i5 = ips.a;
        final abmk abmkVar = (abmk) new jrh(this).a(abmk.class);
        jpc jpcVar = abmkVar.c;
        jpcVar.g(this, new jpd() { // from class: abml
            @Override // defpackage.jpd
            public final void a(Object obj) {
                int intValue = ((Integer) obj).intValue();
                GenericChimeraActivity genericChimeraActivity = GenericChimeraActivity.this;
                abmk abmkVar2 = (abmk) new jrh(genericChimeraActivity).a(abmk.class);
                if (((Integer) abmkVar2.f.d).intValue() == 8) {
                    if (intValue == -1) {
                        abmkVar2.e(5);
                        abnf.h(genericChimeraActivity.n(), 6, genericChimeraActivity.k);
                        return;
                    }
                    abnf.h(genericChimeraActivity.n(), 7, genericChimeraActivity.k);
                }
                if (intValue == -1) {
                    abnf.j(genericChimeraActivity.n(), genericChimeraActivity.j, 2, genericChimeraActivity.k);
                }
                genericChimeraActivity.setResult(intValue);
                genericChimeraActivity.finish();
            }
        });
        abmkVar.d.g(this, new jpd() { // from class: abmm
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ew gI = GenericChimeraActivity.this.gI();
                isd isdVar = (isd) GenericChimeraActivity.h.get((Integer) obj);
                if (isdVar == null) {
                    return;
                }
                bp bpVar = new bp(gI);
                bpVar.G(R.anim.folsom_slide_in, R.anim.folsom_slide_out);
                bpVar.z(R.id.fragment, (dg) isdVar.a(), "nativeview_fragment");
                bpVar.a();
            }
        });
        abmkVar.e.g(this, new jpd() { // from class: abmn
            @Override // defpackage.jpd
            public final void a(Object obj) {
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                if (GenericChimeraActivity.i.contains(num)) {
                    GenericChimeraActivity genericChimeraActivity = GenericChimeraActivity.this;
                    ew gI = genericChimeraActivity.gI();
                    abmz abmzVar = (abmz) genericChimeraActivity.gI().h("webview_fragment");
                    if (abmzVar == null) {
                        Intent intent3 = genericChimeraActivity.getIntent();
                        String stringExtra3 = intent3.getStringExtra("account_name");
                        eiig.x(stringExtra3);
                        String stringExtra4 = intent3.getStringExtra("security_domain");
                        eiig.x(stringExtra4);
                        String str2 = genericChimeraActivity.k;
                        abmz abmzVar2 = new abmz();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("account_name", stringExtra3);
                        bundle2.putString("security_domain", stringExtra4);
                        bundle2.putInt("operation", intValue);
                        bundle2.putString("session_id", str2);
                        abmzVar2.setArguments(bundle2);
                        abmzVar = abmzVar2;
                    }
                    bp bpVar = new bp(gI);
                    bpVar.G(R.anim.folsom_slide_in, R.anim.folsom_slide_out);
                    bpVar.z(R.id.fragment, abmzVar, "webview_fragment");
                    bpVar.a();
                }
            }
        });
        Intent intent3 = getIntent();
        String str2 = this.k;
        String stringExtra3 = intent3.getStringExtra("account_name");
        eiig.x(stringExtra3);
        abmkVar.h = stringExtra3;
        String stringExtra4 = intent3.getStringExtra("security_domain");
        eiig.x(stringExtra4);
        abmkVar.g = stringExtra4;
        abmkVar.j = intent3.getBooleanExtra("is_inline_lskf_consent_possible", false);
        abmkVar.k = intent3.getStringExtra("utm_source");
        abmkVar.l = intent3.getStringExtra("utm_medium");
        abmkVar.m = intent3.getStringExtra("utm_campaign");
        abmkVar.i = intent3.getBooleanExtra("local_key_available", false);
        intent3.getIntExtra("operation", 0);
        abmkVar.o = intent3.getBooleanExtra("offer_reset", false);
        abmkVar.n = str2;
        int i6 = bmfi.f;
        bmfh bmfhVar = new bmfh();
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
            bmfhVar.a = 6;
            bmfhVar.c(6, new bmfk() { // from class: ablw
                @Override // defpackage.bmfk
                public final enss a() {
                    return abmk.this.a(1);
                }
            });
        } else if (r5 == z) {
            bmfhVar.a = 7;
            bmfhVar.c(7, new bmfk() { // from class: abmc
                @Override // defpackage.bmfk
                public final enss a() {
                    return abmk.this.a(4);
                }
            });
        } else if (r5 == c2) {
            bmfhVar.a = 1;
            bmfhVar.c(1, new bmfk() { // from class: abmd
                @Override // defpackage.bmfk
                public final enss a() {
                    KeyguardManager keyguardManager = (KeyguardManager) AppContextProvider.a().getSystemService("keyguard");
                    abmk abmkVar2 = abmk.this;
                    if (keyguardManager != null && keyguardManager.isDeviceSecure()) {
                        return abmkVar2.f.b(2);
                    }
                    abnf.h(abmkVar2.g, 8, abmkVar2.n);
                    abmkVar2.d.hS(1);
                    return abmkVar2.f.a();
                }
            });
            bmfhVar.c(2, new bmfk() { // from class: abme
                @Override // defpackage.bmfk
                public final enss a() {
                    abmk abmkVar2 = abmk.this;
                    abmkVar2.d.hS(2);
                    return abmkVar2.f.a();
                }
            });
            bmfhVar.c(Integer.valueOf(i2), new bmfk() { // from class: abmf
                @Override // defpackage.bmfk
                public final enss a() {
                    abmk abmkVar2 = abmk.this;
                    abmkVar2.d.hS(4);
                    return abmkVar2.f.a();
                }
            });
        } else {
            if (r5 != 3) {
                ((ejhf) abmk.a.j()).B("Unexpected action: %s", action);
                jpcVar.l(0);
                setContentView(R.layout.webview_activity);
                abmkVar.f.i();
            }
            if (Objects.equals(abmkVar.g, "chromesync")) {
                bmfhVar.a = 8;
                bmfhVar.c(8, new bmfk() { // from class: abmg
                    @Override // defpackage.bmfk
                    public final enss a() {
                        return abmk.this.a(2);
                    }
                });
                bmfhVar.c(5, new bmfk() { // from class: abmh
                    @Override // defpackage.bmfk
                    public final enss a() {
                        abmk abmkVar2 = abmk.this;
                        abmkVar2.d.hS(5);
                        return abmkVar2.f.a();
                    }
                });
            } else {
                bmfhVar.a = 3;
                bmfhVar.c(3, new bmfk() { // from class: abmi
                    @Override // defpackage.bmfk
                    public final enss a() {
                        abmk abmkVar2 = abmk.this;
                        abmkVar2.d.hS(3);
                        return abmkVar2.f.a();
                    }
                });
                bmfhVar.c(8, new bmfk() { // from class: ablx
                    @Override // defpackage.bmfk
                    public final enss a() {
                        return abmk.this.a(2);
                    }
                });
                bmfhVar.c(5, new bmfk() { // from class: abmh
                    @Override // defpackage.bmfk
                    public final enss a() {
                        abmk abmkVar2 = abmk.this;
                        abmkVar2.d.hS(5);
                        return abmkVar2.f.a();
                    }
                });
            }
        }
        bmfhVar.e(new Runnable() { // from class: abma
            @Override // java.lang.Runnable
            public final void run() {
                abmk.this.c.hS(-1);
            }
        });
        bmfhVar.f(new iru() { // from class: abmb
            @Override // defpackage.iru
            public final void a(Object obj) {
                abmk.this.c.hS(0);
            }
        });
        abmkVar.f = bmfhVar.a();
        setContentView(R.layout.webview_activity);
        abmkVar.f.i();
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            l.d("Home button pressed", new Object[0]);
            abnf.j(n(), this.j, 7, this.k);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
