package com.google.android.gms.signin.activity;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Base64;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import defpackage.aqsv;
import defpackage.aqsw;
import defpackage.aqsy;
import defpackage.aqxe;
import defpackage.aqxp;
import defpackage.aqxr;
import defpackage.aqxs;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.asng;
import defpackage.asri;
import defpackage.bmas;
import defpackage.bmcz;
import defpackage.bmda;
import defpackage.bmdc;
import defpackage.bmgh;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgu;
import defpackage.bmgx;
import defpackage.bmlv;
import defpackage.byhr;
import defpackage.dcou;
import defpackage.dcov;
import defpackage.dcow;
import defpackage.dcox;
import defpackage.dcrz;
import defpackage.dcsv;
import defpackage.dctl;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiic;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.eiih;
import defpackage.eiir;
import defpackage.eiiw;
import defpackage.eijj;
import defpackage.eijr;
import defpackage.eirn;
import defpackage.eito;
import defpackage.eits;
import defpackage.eiuu;
import defpackage.elct;
import defpackage.elfd;
import defpackage.enox;
import defpackage.enps;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensv;
import defpackage.entc;
import defpackage.entj;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fsbr;
import defpackage.fsbu;
import defpackage.fsca;
import defpackage.fsck;
import defpackage.qet;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SignInChimeraActivity extends qet {
    public static final arxo j = dctl.a("SignInChimeraActivity");
    private static final eits x;
    private static final eiuu y;
    private bmda A;
    private bmcz B;
    public final ensv k = entc.a(new asmf(1, 9));
    public int l;
    public String m;
    public boolean n;
    public Account o;
    public Set p;
    public String q;
    public String r;
    public Intent s;
    public aqxs t;
    public bmgq u;
    public dcox v;
    public dcsv w;
    private bmdc z;

    static {
        eito eitoVar = new eito();
        eitoVar.i(1, bmgh.FETCH_TOS_AND_PP);
        eitoVar.i(2, bmgh.CHOOSE_ACCOUNT);
        eitoVar.i(3, bmgh.RECORD_ACCOUNT_CHIP_CONSENT);
        eitoVar.i(4, bmgh.PRE_CONSENT);
        eitoVar.i(5, bmgh.CONSENT);
        eitoVar.i(6, bmgh.SAVE_SELECTED_ACCOUNT);
        x = eitoVar.b();
        y = eiuu.O(dcov.a, dcov.b, new Scope("https://www.googleapis.com/auth/plus.me"), new Scope("https://www.googleapis.com/auth/userinfo.profile"), new Scope("https://www.googleapis.com/auth/userinfo.email"), new Scope("openid"), new Scope[0]);
    }

    private final void m(Bundle bundle) {
        this.l = bundle.containsKey("start_step") ? bundle.getInt("start_step") : 1;
        this.o = (Account) bundle.getParcelable("picked_account");
        Parcelable[] parcelableArray = bundle.getParcelableArray("SIGN_IN_SCOPE_ARRAY");
        if (parcelableArray != null) {
            this.p = eirn.k(parcelableArray).l(new eiho() { // from class: dcru
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    arxo arxoVar = SignInChimeraActivity.j;
                    return (Scope) ((Parcelable) obj);
                }
            }).p();
        }
        this.q = bundle.getString("terms_of_service_url");
        this.r = bundle.getString("privacy_policy_url");
        this.s = (Intent) bundle.getParcelable("consent_intent");
        Bundle bundle2 = bundle.getBundle("sign_in_options");
        this.v = (bundle2 != null ? dcow.a(bundle2) : new dcow()).b();
    }

    public final void a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    public final void k(long j2, int i, boolean z) {
        fecj v = elct.a.v();
        bmgh bmghVar = (bmgh) x.get(Integer.valueOf(i));
        eiig.x(bmghVar);
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elct elctVar = (elct) fecpVar;
        elctVar.c = bmghVar.i;
        elctVar.b |= 1;
        if (!fecpVar.L()) {
            v.U();
        }
        elct elctVar2 = (elct) v.b;
        elctVar2.b |= 4096;
        elctVar2.o = z;
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (!v.b.L()) {
            v.U();
        }
        elct elctVar3 = (elct) v.b;
        elctVar3.b |= 2048;
        elctVar3.n = currentTimeMillis;
        elct elctVar4 = (elct) v.Q();
        fecj v2 = elfd.a.v();
        String str = this.v.g;
        if (str != null) {
            if (!v2.b.L()) {
                v2.U();
            }
            elfd elfdVar = (elfd) v2.b;
            elfdVar.b |= 2;
            elfdVar.e = str;
        }
        bmgq bmgqVar = this.u;
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        elfd elfdVar2 = (elfd) fecpVar2;
        elfdVar2.d = 5;
        elfdVar2.b |= 1;
        if (!fecpVar2.L()) {
            v2.U();
        }
        elfd elfdVar3 = (elfd) v2.b;
        elctVar4.getClass();
        elfdVar3.i = elctVar4;
        elfdVar3.b |= 32;
        bmgqVar.a((elfd) v2.Q());
    }

    public final void l() {
        Intent c;
        enss enssVar;
        j.j("startNextStep() is called, signInStep=%d.", Integer.valueOf(this.l));
        int i = this.l;
        switch (i) {
            case 1:
                final String l = asri.l();
                if (!eirn.j(eijj.e(',').d().i().l(fsca.a.a().b())).s(new eiih() { // from class: dcrj
                    @Override // defpackage.eiih
                    public final boolean a(Object obj) {
                        arxo arxoVar = SignInChimeraActivity.j;
                        return l.equalsIgnoreCase((String) obj);
                    }
                })) {
                    enssVar = enox.f(this.A.b(1, new eijr() { // from class: dcrh
                        @Override // defpackage.eijr
                        public final Object a() {
                            final SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                            return signInChimeraActivity.k.submit(new Callable() { // from class: dcrp
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    SignInChimeraActivity signInChimeraActivity2 = SignInChimeraActivity.this;
                                    try {
                                        Context baseContext = signInChimeraActivity2.getBaseContext();
                                        asgo asgoVar = new asgo(baseContext, fsca.a.a().c(), (int) fsca.a.a().a(), -1, 25857);
                                        asgoVar.h("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
                                        asgoVar.h("X-Android-Package", baseContext.getPackageName());
                                        asgoVar.h("X-Android-Cert", asng.m(baseContext, baseContext.getPackageName()));
                                        dcsw dcswVar = new dcsw(asgoVar);
                                        String str = signInChimeraActivity2.m;
                                        eiig.x(str);
                                        byte[] ab = asng.ab(signInChimeraActivity2.getBaseContext(), str);
                                        eiig.x(ab);
                                        fecj v = feqe.a.v();
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        ((feqe) v.b).c = str;
                                        String encodeToString = Base64.encodeToString(ab, 2);
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        feqe feqeVar = (feqe) v.b;
                                        encodeToString.getClass();
                                        feqeVar.b = encodeToString;
                                        feqe feqeVar2 = (feqe) v.Q();
                                        feqk feqkVar = feqk.a;
                                        fecj v2 = feqkVar.v();
                                        fecj v3 = feqg.a.v();
                                        if (!v3.b.L()) {
                                            v3.U();
                                        }
                                        feqg feqgVar = (feqg) v3.b;
                                        feqeVar2.getClass();
                                        feqgVar.c = feqeVar2;
                                        feqgVar.b = 3;
                                        if (!v2.b.L()) {
                                            v2.U();
                                        }
                                        feqk feqkVar2 = (feqk) v2.b;
                                        feqg feqgVar2 = (feqg) v3.Q();
                                        feqgVar2.getClass();
                                        feqkVar2.c = feqgVar2;
                                        feqkVar2.b |= 1;
                                        feqk feqkVar3 = (feqk) v2.Q();
                                        dcsw dcswVar2 = new dcsw(dcswVar, bzgc.a, bxyy.b);
                                        if (dcsw.a == null) {
                                            ftxd ftxdVar = ftxd.UNARY;
                                            febw febwVar = furo.a;
                                            dcsw.a = new ftxe(ftxdVar, "google.identity.clientauthconfig.v1.ClientAuthConfig/GetDisplayBrand", new furn(feqkVar), new furn(feql.a), false);
                                        }
                                        feql feqlVar = (feql) dcswVar2.b.e(dcsw.a, feqkVar3, 10000L, TimeUnit.MILLISECONDS, dcswVar2.c);
                                        if (feqlVar == null) {
                                            throw new IOException("No Brand found for the calling package.");
                                        }
                                        if ((feqlVar.b & 1) != 0) {
                                            feqi feqiVar = feqlVar.c;
                                            if (feqiVar == null) {
                                                feqiVar = feqi.a;
                                            }
                                            signInChimeraActivity2.q = eiif.a(feqiVar.c);
                                            signInChimeraActivity2.r = eiif.a(feqiVar.b);
                                        }
                                        return eiid.j(2);
                                    } catch (ftye e) {
                                        throw new IOException(e);
                                    }
                                }
                            });
                        }
                    }), IOException.class, new eiho() { // from class: dcri
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            IOException iOException = (IOException) obj;
                            if (fsca.a.a().e()) {
                                SignInChimeraActivity.j.h("Couldn't fetch app's branding information, but continuing without it.", new Object[0]);
                                return eiid.j(2);
                            }
                            SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                            SignInChimeraActivity.j.g("Errors encountered when trying to fetch app's branding information", iOException, new Object[0]);
                            signInChimeraActivity.a(0, null);
                            return eigb.a;
                        }
                    }, this.z);
                    break;
                } else {
                    final entj entjVar = new entj();
                    new AlertDialog.Builder(this).setCancelable(true).setTitle(R.string.signin_not_supported_dialog_title).setMessage(R.string.signin_not_supported_dialog_message).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: dcrl
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            arxo arxoVar = SignInChimeraActivity.j;
                            dialogInterface.cancel();
                        }
                    }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: dcrn
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            Intent intent = new Intent();
                            intent.putExtra("<<ResolutionFailureErrorDetail>>", 17);
                            SignInChimeraActivity.this.a(0, intent);
                            entjVar.q(eigb.a);
                        }
                    }).create().show();
                    enssVar = entjVar;
                    break;
                }
            case 2:
                boolean booleanExtra = getIntent().getBooleanExtra("SIGN_IN_SAVE_DEFAULT_ACCOUNT", false);
                boolean a = fsck.a.a().a();
                int i2 = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
                if (a) {
                    aqsv aqsvVar = new aqsv();
                    aqsvVar.c(Arrays.asList("com.google"));
                    aqsvVar.d();
                    aqsvVar.d = booleanExtra;
                    aqsvVar.e();
                    aqsvVar.g = getIntent().getStringExtra("hosted_domain");
                    aqsvVar.e = this.m;
                    if (true == fsbr.f()) {
                        i2 = 1001;
                    }
                    aqsvVar.f = i2;
                    String str = this.r;
                    String str2 = this.q;
                    aqsw aqswVar = new aqsw();
                    aqswVar.b = str;
                    aqswVar.a = str2;
                    aqsvVar.h = aqswVar;
                    c = aqsy.a(aqsvVar.a());
                } else {
                    c = aqsy.c(null, null, new String[]{"com.google"}, true, booleanExtra, 0, 2, getIntent().getStringExtra("hosted_domain"), true);
                    c.putExtra("realClientPackage", this.m);
                    Bundle bundle = new Bundle(Bundle.EMPTY);
                    ((Integer) ((eiir) eiid.j(Integer.valueOf(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS))).a).intValue();
                    bundle.putInt("theme", ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
                    eiid i3 = eiid.i(this.r);
                    eiid i4 = eiid.i(this.q);
                    bundle.putBoolean("should_show_consent", true);
                    bundle.putString("privacy_policy_url", (String) i3.f());
                    bundle.putString("terms_of_service_url", (String) i4.f());
                    c.putExtra("first_party_options_bundle", new bmas(bundle).a);
                }
                enssVar = enps.f(this.B.b(2, c), new eiho() { // from class: dcry
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        Intent intent;
                        SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                        bmcw bmcwVar = (bmcw) obj;
                        if (!signInChimeraActivity.getIntent().getBooleanExtra("complete_sign_in_process", false) || bmcwVar.a != -1 || (intent = bmcwVar.b) == null) {
                            signInChimeraActivity.a(bmcwVar.a, signInChimeraActivity.n ? bmcwVar.b : null);
                            return eigb.a;
                        }
                        String stringExtra = intent.getStringExtra("authAccount");
                        eiig.x(stringExtra);
                        String stringExtra2 = intent.getStringExtra("accountType");
                        eiig.x(stringExtra2);
                        signInChimeraActivity.o = new Account(stringExtra, stringExtra2);
                        return eiid.j(3);
                    }
                }, this.z);
                break;
            case 3:
                if (!y.containsAll(this.p)) {
                    enssVar = ensj.i(eiid.j(4));
                    break;
                } else {
                    Account account = this.o;
                    eiig.x(account);
                    final RecordConsentRequest recordConsentRequest = new RecordConsentRequest(1, account, (Scope[]) this.p.toArray(new Scope[0]), getIntent().getStringExtra("service_client_id"));
                    if (!fsbu.c()) {
                        enssVar = enps.f(this.A.b(3, new eijr() { // from class: dcrs
                            @Override // defpackage.eijr
                            public final Object a() {
                                aqxs aqxsVar = SignInChimeraActivity.this.t;
                                return bmdm.b(aqxsVar.d(new dcsi(aqxsVar, recordConsentRequest)));
                            }
                        }), new eiho() { // from class: dcrt
                            @Override // defpackage.eiho
                            public final Object apply(Object obj) {
                                arxo arxoVar = SignInChimeraActivity.j;
                                if (!((Status) obj).e()) {
                                    SignInChimeraActivity.j.m("Failed to record the consent.", new Object[0]);
                                }
                                return eiid.j(4);
                            }
                        }, this.z);
                        break;
                    } else {
                        enssVar = enps.f(enox.f(this.A.b(3, new eijr() { // from class: dcrb
                            @Override // defpackage.eijr
                            public final Object a() {
                                dcsv dcsvVar = SignInChimeraActivity.this.w;
                                arcy arcyVar = new arcy();
                                final RecordConsentRequest recordConsentRequest2 = recordConsentRequest;
                                arcyVar.a = new arco() { // from class: dcsn
                                    @Override // defpackage.arco
                                    public final void d(Object obj, Object obj2) {
                                        ((dcte) ((dcti) obj).H()).d(RecordConsentRequest.this, new dcss((dfau) obj2));
                                    }
                                };
                                arcyVar.d = 6305;
                                return doci.b(dcsvVar.iT(arcyVar.a()));
                            }
                        }), aqxe.class, new eiho() { // from class: dcrm
                            @Override // defpackage.eiho
                            public final Object apply(Object obj) {
                                SignInChimeraActivity.j.m("Failed to record the consent.", new Object[0]);
                                return null;
                            }
                        }, this.z), new eiho() { // from class: dcrr
                            @Override // defpackage.eiho
                            public final Object apply(Object obj) {
                                arxo arxoVar = SignInChimeraActivity.j;
                                return eiid.j(4);
                            }
                        }, this.z);
                        break;
                    }
                }
            case 4:
                if (this.s == null) {
                    enssVar = enps.f(fsbu.c() ? this.A.b(4, new eijr() { // from class: dcrv
                        @Override // defpackage.eijr
                        public final Object a() {
                            SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                            dcsv dcsvVar = signInChimeraActivity.w;
                            Account account2 = signInChimeraActivity.o;
                            eiig.x(account2);
                            final AuthAccountRequest authAccountRequest = new AuthAccountRequest(account2, signInChimeraActivity.p);
                            arcy arcyVar = new arcy();
                            arcyVar.a = new arco() { // from class: dcso
                                @Override // defpackage.arco
                                public final void d(Object obj, Object obj2) {
                                    ((dcte) ((dcti) obj).H()).a(AuthAccountRequest.this, new dcsu((dfau) obj2));
                                }
                            };
                            arcyVar.d = 6307;
                            return doci.b(dcsvVar.iO(arcyVar.a()));
                        }
                    }) : this.A.b(4, new eijr() { // from class: dcrw
                        @Override // defpackage.eijr
                        public final Object a() {
                            SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                            aqxs aqxsVar = signInChimeraActivity.t;
                            Account account2 = signInChimeraActivity.o;
                            eiig.x(account2);
                            return bmdm.b(aqxsVar.d(new dcsk(aqxsVar, new AuthAccountRequest(account2, signInChimeraActivity.p))));
                        }
                    }), new eiho() { // from class: dcrx
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            AuthAccountResult authAccountResult = (AuthAccountResult) obj;
                            if (authAccountResult.a().e()) {
                                return eiid.j(6);
                            }
                            SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                            Intent intent = authAccountResult.c;
                            if (intent != null) {
                                signInChimeraActivity.s = intent;
                                return eiid.j(5);
                            }
                            Intent intent2 = new Intent();
                            intent2.putExtra("<<ResolutionFailureErrorDetail>>", authAccountResult.b);
                            signInChimeraActivity.a(0, intent2);
                            return eigb.a;
                        }
                    }, this.z);
                    break;
                } else {
                    enssVar = ensj.i(eiid.j(5));
                    break;
                }
            case 5:
                Intent intent = this.s;
                if (intent != null) {
                    intent.setExtrasClassLoader(Scope.class.getClassLoader());
                }
                bmcz bmczVar = this.B;
                Intent intent2 = this.s;
                eiig.x(intent2);
                enssVar = enps.f(bmczVar.b(5, intent2), new eiho() { // from class: dcrk
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        bmcw bmcwVar = (bmcw) obj;
                        int i5 = bmcwVar.a;
                        if (i5 == -1) {
                            return eiid.j(6);
                        }
                        SignInChimeraActivity.this.a(i5, bmcwVar.b);
                        return eigb.a;
                    }
                }, this.z);
                break;
            case 6:
                final int intExtra = getIntent().getIntExtra("com.google.android.gms.signin.extraSessionId", -1);
                if (intExtra != -1) {
                    if (!fsbu.c()) {
                        enssVar = enps.f(this.A.b(6, new eijr() { // from class: dcrf
                            @Override // defpackage.eijr
                            public final Object a() {
                                SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                                aqxs aqxsVar = signInChimeraActivity.t;
                                Account account2 = signInChimeraActivity.o;
                                eiig.x(account2);
                                return bmdm.b(aqxsVar.d(new dcsg(aqxsVar, intExtra, account2)));
                            }
                        }), new eiho() { // from class: dcrg
                            @Override // defpackage.eiho
                            public final Object apply(Object obj) {
                                if (!((Status) obj).e()) {
                                    SignInChimeraActivity.j.m("Saving selected account failed. User probably need to re-select.", new Object[0]);
                                }
                                SignInChimeraActivity.this.a(-1, null);
                                return eigb.a;
                            }
                        }, this.z);
                        break;
                    } else {
                        enssVar = enps.f(enox.f(this.A.b(6, new eijr() { // from class: dcrc
                            @Override // defpackage.eijr
                            public final Object a() {
                                SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                                dcsv dcsvVar = signInChimeraActivity.w;
                                final Account account2 = signInChimeraActivity.o;
                                eiig.x(account2);
                                arcy arcyVar = new arcy();
                                final int i5 = intExtra;
                                arcyVar.a = new arco() { // from class: dcsp
                                    @Override // defpackage.arco
                                    public final void d(Object obj, Object obj2) {
                                        ((dcte) ((dcti) obj).H()).g(i5, account2, new dcsr((dfau) obj2));
                                    }
                                };
                                arcyVar.d = 6303;
                                return doci.b(dcsvVar.iT(arcyVar.a()));
                            }
                        }), aqxe.class, new eiho() { // from class: dcrd
                            @Override // defpackage.eiho
                            public final Object apply(Object obj) {
                                SignInChimeraActivity.j.m("Saving selected account failed. User probably needs to re-select.", new Object[0]);
                                return null;
                            }
                        }, this.z), new eiho() { // from class: dcre
                            @Override // defpackage.eiho
                            public final Object apply(Object obj) {
                                SignInChimeraActivity.this.a(-1, null);
                                return eigb.a;
                            }
                        }, this.z);
                        break;
                    }
                } else {
                    a(-1, null);
                    enssVar = ensj.i(eigb.a);
                    break;
                }
            default:
                throw new IllegalStateException(String.format("Unknown sign-in step: %d", Integer.valueOf(i)));
        }
        ensj.t(enssVar, new dcrz(this, System.currentTimeMillis()), this.z);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(R.style.Identity_Theme_NoUIActivity);
        this.u = bmgp.b(this, null);
        if (bundle != null) {
            this.m = bundle.getString("SIGN_IN_PACKAGE_NAME");
            this.n = bundle.getBoolean("launched_by_gmscore");
            m(bundle);
        } else {
            String q = asng.q(this);
            this.m = q;
            boolean equalsIgnoreCase = "com.google.android.gms".equalsIgnoreCase(q);
            this.n = equalsIgnoreCase;
            if (equalsIgnoreCase) {
                this.m = (String) eiic.c(getIntent().getStringExtra("SIGN_IN_PACKAGE_NAME"), this.m);
            }
            Bundle extras = getIntent().getExtras();
            eiig.x(extras);
            m(extras);
            dcox dcoxVar = this.v;
            if (dcoxVar.g == null) {
                dcow dcowVar = new dcow();
                dcowVar.a = dcoxVar.b;
                dcowVar.b = dcoxVar.c;
                dcowVar.c = dcoxVar.d;
                dcowVar.d = dcoxVar.e;
                dcowVar.e = dcoxVar.f;
                dcowVar.f = null;
                dcowVar.g = dcoxVar.h;
                dcowVar.h = dcoxVar.i;
                dcowVar.i = dcoxVar.j;
                dcowVar.f = bmgx.a();
                dcox b = dcowVar.b();
                this.v = b;
                this.u.a(bmlv.a(this.m, (Scope[]) this.p.toArray(new Scope[0]), b));
            }
        }
        bmgu.a(this, new eiiw() { // from class: dcro
            @Override // defpackage.eiiw
            public final void lB(Object obj) {
                SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                signInChimeraActivity.u.a(bmgw.b(2, (bmgv) obj, signInChimeraActivity.v.g));
            }
        });
        j.d("Log Session ID: ".concat(String.valueOf(this.v.g)), new Object[0]);
        this.z = new bmdc(new byhr(Looper.getMainLooper()));
        if (fsbu.c() && this.w == null) {
            String str = this.m;
            Bundle a = this.v.a();
            a.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
            this.w = new dcsv(this, new dcou(a));
        } else {
            String str2 = this.m;
            dcox dcoxVar2 = this.v;
            aqxp aqxpVar = new aqxp(this);
            aqxpVar.h(this, 0, new aqxr() { // from class: dcrq
                @Override // defpackage.arcf
                public final void onConnectionFailed(ConnectionResult connectionResult) {
                    SignInChimeraActivity.this.a(0, null);
                }
            });
            aqxpVar.d(dcov.d, new dcou(dcoxVar2.a()));
            aqxpVar.c = str2;
            this.t = aqxpVar.a();
        }
        this.A = bmda.a(this);
        this.B = bmcz.a(this);
        l();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("start_step", this.l);
        bundle.putParcelable("picked_account", this.o);
        bundle.putString("SIGN_IN_PACKAGE_NAME", this.m);
        bundle.putBoolean("launched_by_gmscore", this.n);
        bundle.putParcelableArray("SIGN_IN_SCOPE_ARRAY", (Parcelable[]) this.p.toArray(new Scope[0]));
        bundle.putString("terms_of_service_url", this.q);
        bundle.putString("privacy_policy_url", this.r);
        bundle.putParcelable("consent_intent", this.s);
        bundle.putBundle("sign_in_options", this.v.a());
    }
}
