package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aozv;
import defpackage.aqup;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.asnb;
import defpackage.asnd;
import defpackage.asng;
import defpackage.bmda;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgu;
import defpackage.bmgx;
import defpackage.eigb;
import defpackage.eihn;
import defpackage.eiic;
import defpackage.eiid;
import defpackage.eiih;
import defpackage.eiiw;
import defpackage.eijr;
import defpackage.eitj;
import defpackage.eivv;
import defpackage.ejcb;
import defpackage.ejzo;
import defpackage.eldg;
import defpackage.eler;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.enre;
import defpackage.ensj;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkox;
import defpackage.fksf;
import defpackage.qet;
import defpackage.vqi;
import defpackage.vrc;
import defpackage.xtw;
import defpackage.xuk;
import defpackage.xum;
import defpackage.yye;
import defpackage.yyf;
import defpackage.yyg;
import defpackage.yyh;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CredentialPickerChimeraActivity extends qet implements View.OnClickListener, AdapterView.OnItemClickListener {
    public String j;
    public eiid k;
    public eiid l;
    public eiid m;
    public yyh o;
    public ListView p;
    public asnb q;
    public vrc r;
    public String s;
    public bmgq t;
    private boolean u;
    private long v;
    private bmda w;
    private int x;
    public eiid n = eigb.a;
    private int y = 1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Iterable, java.lang.Object] */
    public final void o(int i, int i2, Credential credential) {
        this.y = i2;
        Intent intent = new Intent();
        if (credential != null) {
            intent.putExtra("com.google.android.gms.credentials.Credential", credential);
        }
        int i3 = i2 - 1;
        fecj v = elfb.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elfb elfbVar = (elfb) fecpVar;
        elfbVar.b |= 1;
        elfbVar.c = i;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        elfb elfbVar2 = (elfb) fecpVar2;
        elfbVar2.b |= 2;
        elfbVar2.d = i3;
        if (!fecpVar2.L()) {
            v.U();
        }
        elfb elfbVar3 = (elfb) v.b;
        elfbVar3.f = 201;
        elfbVar3.b |= 8;
        fecj v2 = eldg.a.v();
        if (credential != null && this.k.h()) {
            Pattern pattern = Patterns.EMAIL_ADDRESS;
            String str = credential.a;
            int i4 = pattern.matcher(str).matches() ? 2 : Patterns.PHONE.matcher(str).matches() ? 3 : 1;
            if (!v2.b.L()) {
                v2.U();
            }
            eldg eldgVar = (eldg) v2.b;
            eldgVar.c = i4 - 1;
            eldgVar.b |= 1;
        }
        eldg eldgVar2 = (eldg) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        elfb elfbVar4 = (elfb) v.b;
        eldgVar2.getClass();
        elfbVar4.i = eldgVar2;
        elfbVar4.b |= 64;
        bmgq bmgqVar = this.t;
        if (this.n.h()) {
            eiid c = eivv.c(this.n.c(), new eiih() { // from class: yxz
                @Override // defpackage.eiih
                public final boolean a(Object obj) {
                    return ((InternalCredentialWrapper) obj).b != null;
                }
            });
            if (c.h()) {
                bmgqVar = bmgp.a(this, ((InternalCredentialWrapper) c.c()).b.name);
            }
        }
        fecj v3 = elfd.a.v();
        String str2 = this.s;
        if (!v3.b.L()) {
            v3.U();
        }
        fecp fecpVar3 = v3.b;
        elfd elfdVar = (elfd) fecpVar3;
        str2.getClass();
        elfdVar.b = 2 | elfdVar.b;
        elfdVar.e = str2;
        if (!fecpVar3.L()) {
            v3.U();
        }
        fecp fecpVar4 = v3.b;
        elfd elfdVar2 = (elfd) fecpVar4;
        elfdVar2.d = 17;
        elfdVar2.b |= 1;
        if (!fecpVar4.L()) {
            v3.U();
        }
        elfd elfdVar3 = (elfd) v3.b;
        elfb elfbVar5 = (elfb) v.Q();
        elfbVar5.getClass();
        elfdVar3.s = elfbVar5;
        elfdVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bmgqVar.a((elfd) v3.Q());
        setResult(i, intent);
        finish();
    }

    private final void p(int i) {
        if (fksf.c()) {
            bmgq bmgqVar = this.t;
            fecj v = elfd.a.v();
            String str = this.s;
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            elfd elfdVar = (elfd) fecpVar;
            str.getClass();
            elfdVar.b |= 2;
            elfdVar.e = str;
            if (!fecpVar.L()) {
                v.U();
            }
            elfd elfdVar2 = (elfd) v.b;
            elfdVar2.d = 6;
            elfdVar2.b |= 1;
            fecj v2 = eler.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar2 = v2.b;
            eler elerVar = (eler) fecpVar2;
            elerVar.c = i - 1;
            elerVar.b |= 1;
            String str2 = this.j;
            if (!fecpVar2.L()) {
                v2.U();
            }
            eler elerVar2 = (eler) v2.b;
            str2.getClass();
            elerVar2.b |= 8;
            elerVar2.f = str2;
            eler elerVar3 = (eler) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            elfd elfdVar3 = (elfd) v.b;
            elerVar3.getClass();
            elfdVar3.j = elerVar3;
            elfdVar3.b |= 64;
            bmgqVar.a((elfd) v.Q());
        }
    }

    public final CredentialPickerConfig a() {
        return this.k.h() ? ((HintRequest) this.k.c()).b : ((CredentialRequest) this.l.c()).d;
    }

    public final void k(final InternalCredentialWrapper internalCredentialWrapper) {
        this.p.postDelayed(new Runnable() { // from class: yxy
            @Override // java.lang.Runnable
            public final void run() {
                CredentialPickerChimeraActivity.this.l();
            }
        }, 400L);
        this.r.b(this.j);
        this.m = eiid.j(internalCredentialWrapper);
        if (this.l.h()) {
            final Account account = internalCredentialWrapper.b;
            arwm.s(account);
            ensj.t(this.w.b(2, new eijr() { // from class: yxx
                @Override // defpackage.eijr
                public final Object a() {
                    CredentialPickerChimeraActivity credentialPickerChimeraActivity = CredentialPickerChimeraActivity.this;
                    vrc vrcVar = credentialPickerChimeraActivity.r;
                    final String str = credentialPickerChimeraActivity.j;
                    final boolean z = ((CredentialRequest) credentialPickerChimeraActivity.l.c()).f;
                    final String str2 = ((CredentialRequest) credentialPickerChimeraActivity.l.c()).g;
                    final String str3 = ((CredentialRequest) credentialPickerChimeraActivity.l.c()).h;
                    arcy arcyVar = new arcy();
                    arcyVar.d = 1524;
                    final Account account2 = account;
                    final Credential credential = internalCredentialWrapper.a;
                    arcyVar.a = new arco() { // from class: vqp
                        @Override // defpackage.arco
                        public final void d(Object obj, Object obj2) {
                            int i = vrc.a;
                            ((xue) ((xtv) obj).H()).c(new vrb((dfau) obj2, Credential.class), account2, str, credential, z, str2, str3);
                        }
                    };
                    return doci.b(vrcVar.iO(arcyVar.a()));
                }
            }), new yyf(this), enre.a);
        } else {
            final Credential credential = internalCredentialWrapper.a;
            vqi vqiVar = new vqi(credential);
            int i = eitj.d;
            vqiVar.c = ejcb.a;
            final eiid c = eivv.c(asnd.h(this, getPackageName()), new eiih() { // from class: yxu
                @Override // defpackage.eiih
                public final boolean a(Object obj) {
                    return ((Account) obj).name.equals(Credential.this.a);
                }
            });
            if (((HintRequest) this.k.c()).f && c.h()) {
                ensj.t(this.w.b(2, new eijr() { // from class: yxv
                    @Override // defpackage.eijr
                    public final Object a() {
                        eiid eiidVar = c;
                        CredentialPickerChimeraActivity credentialPickerChimeraActivity = CredentialPickerChimeraActivity.this;
                        vrc vrcVar = credentialPickerChimeraActivity.r;
                        final Account account2 = (Account) eiidVar.c();
                        final String str = credentialPickerChimeraActivity.j;
                        final String str2 = ((HintRequest) credentialPickerChimeraActivity.k.c()).g;
                        final String str3 = ((HintRequest) credentialPickerChimeraActivity.k.c()).h;
                        arcy arcyVar = new arcy();
                        arcyVar.d = 1525;
                        arcyVar.a = new arco() { // from class: vqq
                            @Override // defpackage.arco
                            public final void d(Object obj, Object obj2) {
                                int i2 = vrc.a;
                                ((xue) ((xtv) obj).H()).f(new vrb((dfau) obj2, IdToken.class), account2, str, str2, str3);
                            }
                        };
                        return doci.b(vrcVar.iO(arcyVar.a()));
                    }
                }), new yyg(this, vqiVar), enre.a);
            } else {
                o(-1, 101, vqiVar.a());
            }
        }
        int i2 = this.x;
        if (fksf.c()) {
            bmgq bmgqVar = this.t;
            fecj v = elfd.a.v();
            String str = this.s;
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            elfd elfdVar = (elfd) fecpVar;
            str.getClass();
            elfdVar.b |= 2;
            elfdVar.e = str;
            if (!fecpVar.L()) {
                v.U();
            }
            elfd elfdVar2 = (elfd) v.b;
            elfdVar2.d = 6;
            elfdVar2.b |= 1;
            fecj v2 = eler.a.v();
            int i3 = true != this.l.h() ? 102 : 202;
            if (!v2.b.L()) {
                v2.U();
            }
            eler elerVar = (eler) v2.b;
            elerVar.c = i3 - 1;
            elerVar.b |= 1;
            int size = ((eitj) this.n.c()).size();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar2 = v2.b;
            eler elerVar2 = (eler) fecpVar2;
            elerVar2.b |= 4;
            elerVar2.e = size;
            if (!fecpVar2.L()) {
                v2.U();
            }
            fecp fecpVar3 = v2.b;
            eler elerVar3 = (eler) fecpVar3;
            elerVar3.b = 2 | elerVar3.b;
            elerVar3.d = i2;
            String str2 = this.j;
            if (!fecpVar3.L()) {
                v2.U();
            }
            eler elerVar4 = (eler) v2.b;
            str2.getClass();
            elerVar4.b |= 8;
            elerVar4.f = str2;
            eler elerVar5 = (eler) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            elfd elfdVar3 = (elfd) v.b;
            elerVar5.getClass();
            elfdVar3.j = elerVar5;
            elfdVar3.b |= 64;
            bmgqVar.a((elfd) v.Q());
            if (this.l.h()) {
                this.t.a(xum.d(this.s, ((InternalCredentialWrapper) ((eitj) this.n.c()).get(i2)).a));
            }
        }
    }

    public final void l() {
        this.p.setEnabled(false);
        View findViewById = findViewById(R.id.progress_indicator_container);
        ImageView imageView = (ImageView) findViewById(R.id.progress_indicator);
        findViewById.setVisibility(0);
        if (this.q == null) {
            asnb asnbVar = new asnb(getContainerActivity(), findViewById(R.id.progress_indicator));
            this.q = asnbVar;
            asnbVar.setAlpha(255);
            this.q.c(0);
            this.q.a(-12417548);
        }
        imageView.setImageDrawable(this.q);
        this.q.start();
    }

    public final void m(int i, int i2) {
        o(i, i2, null);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        m(0, true != this.l.h() ? 106 : 206);
        p(true != this.l.h() ? 107 : 207);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.add_account) {
            m(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, true != this.l.h() ? 104 : 204);
            p(true != this.l.h() ? 105 : 205);
        } else if (id == R.id.cancel) {
            m(1001, true != this.l.h() ? 102 : 202);
            p(true != this.l.h() ? 103 : 203);
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        eiid j;
        String string;
        super.onCreate(bundle);
        setTheme(R.style.Auth_CredentialsDialog);
        Bundle bundle2 = (Bundle) eiic.c(bundle, (Bundle) eiic.c(getIntent().getExtras(), Bundle.EMPTY));
        ClassLoader classLoader = CredentialRequest.class.getClassLoader();
        arwm.s(classLoader);
        bundle2.setClassLoader(classLoader);
        String q = asng.q(this);
        if (q == null) {
            j = eigb.a;
        } else {
            String string2 = bundle2.getString("claimedCallingPackage");
            j = (string2 == null || eihn.a(q, string2)) ? eiid.j(q) : !aqup.d(this).h(q) ? eigb.a : eiid.j(string2);
        }
        eiid a = !j.h() ? eigb.a : aozv.a(this, (String) j.c());
        this.u = bundle2.getBoolean("firstTime");
        if (TextUtils.isEmpty(bundle2.getString("logSessionId"))) {
            string = bmgx.a();
        } else {
            string = bundle2.getString("logSessionId");
            arwm.s(string);
        }
        this.s = string;
        this.v = bundle2.getLong("popupTimeMillis", SystemClock.elapsedRealtime());
        eigb eigbVar = eigb.a;
        this.l = eigbVar;
        byte[] byteArray = bundle2.getByteArray("credentialRequest");
        if (byteArray != null) {
            this.l = eiid.i((CredentialRequest) arxd.a(byteArray, CredentialRequest.CREATOR));
        }
        Object obj = bundle2.get("com.google.android.gms.credentials.HintRequest");
        this.k = obj == null ? eigbVar : obj instanceof byte[] ? eiid.j((HintRequest) arxd.a((byte[]) obj, HintRequest.CREATOR)) : eiid.j((HintRequest) obj);
        this.m = eigbVar;
        byte[] byteArray2 = bundle2.getByteArray("selectedCredential");
        if (byteArray2 != null) {
            this.m = eiid.i((InternalCredentialWrapper) arxd.a(byteArray2, InternalCredentialWrapper.CREATOR));
        }
        this.t = bmgp.a(this, null);
        if (!a.h()) {
            this.j = "";
            p(2);
            m(0, 2);
            return;
        }
        this.j = (String) a.c();
        if (!this.l.h() && !this.k.h()) {
            m(0, 2);
            return;
        }
        getWindow().addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        getWindow().addFlags(2);
        this.w = bmda.a(this);
        String str = this.s;
        arwm.s(str);
        this.r = new vrc(this, new xtw(str));
        if (this.l.h()) {
            setContentView(R.layout.credential_picker_activity);
        } else {
            setContentView(R.layout.credential_hint_picker_activity);
        }
        findViewById(R.id.credential_picker_layout).setContentDescription(getString(true != this.l.h() ? R.string.credentials_hint_ally_announce : R.string.credentials_picker_ally_announce));
        findViewById(R.id.add_account).setVisibility(8);
        this.p = (ListView) findViewById(R.id.credential_picker_options);
        yyh yyhVar = new yyh(this, new ArrayList());
        this.o = yyhVar;
        this.p.setAdapter((ListAdapter) yyhVar);
        this.p.setOnItemClickListener(this);
        TextView textView = (TextView) findViewById(R.id.credentials_warm_welcome_text);
        if (textView != null) {
            Resources resources = getResources();
            String string3 = resources.getString(R.string.credentials_warm_welcome_prefix);
            String string4 = resources.getString(R.string.credentials_warm_welcome_link_text);
            String c = fkox.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) string4);
            spannableStringBuilder.setSpan(new DefensiveURLSpan(c, true), length, spannableStringBuilder.length(), 33);
            if (!TextUtils.isEmpty(null)) {
                spannableStringBuilder.append((CharSequence) null);
            }
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (this.u && this.l.h()) {
            View findViewById = findViewById(R.id.google_logo);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            if (Build.VERSION.SDK_INT != 26 && (getResources().getConfiguration().screenLayout & 15) < 3) {
                setRequestedOrientation(1);
            }
        } else {
            View findViewById2 = findViewById(R.id.credentials_warm_welcome_layout);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
            if (this.k.h()) {
                TextView textView2 = (TextView) findViewById(R.id.credentials_hint_picker_title);
                int i = a().d;
                int i2 = R.string.credentials_hint_picker_title_continue;
                if ((i == 1 || i == 2 || i == 3) && i != 1) {
                    if (i == 2) {
                        i2 = R.string.credentials_hint_picker_title;
                    } else if (i == 3) {
                        i2 = R.string.credentials_hint_picker_title_new_account;
                    }
                }
                textView2.setText(i2);
            }
        }
        l();
        if (this.u && this.l.h()) {
            this.r.c();
        }
        if (fksf.c()) {
            bmgu.a(this, new eiiw() { // from class: yyc
                @Override // defpackage.eiiw
                public final void lB(Object obj2) {
                    CredentialPickerChimeraActivity credentialPickerChimeraActivity = CredentialPickerChimeraActivity.this;
                    credentialPickerChimeraActivity.t.a(bmgw.b(202, (bmgv) obj2, credentialPickerChimeraActivity.s));
                }
            });
        }
        ensj.t(this.w.b(1, new eijr() { // from class: yyd
            @Override // defpackage.eijr
            public final Object a() {
                CredentialPickerChimeraActivity credentialPickerChimeraActivity = CredentialPickerChimeraActivity.this;
                if (credentialPickerChimeraActivity.l.h()) {
                    vrc vrcVar = credentialPickerChimeraActivity.r;
                    final String str2 = credentialPickerChimeraActivity.j;
                    final CredentialRequest credentialRequest = (CredentialRequest) credentialPickerChimeraActivity.l.c();
                    arcy arcyVar = new arcy();
                    arcyVar.d = 1522;
                    arcyVar.a = new arco() { // from class: vqm
                        @Override // defpackage.arco
                        public final void d(Object obj2, Object obj3) {
                            int i3 = vrc.a;
                            ((xue) ((xtv) obj2).H()).d(new vra((dfau) obj3, InternalCredentialWrapper.class), str2, credentialRequest);
                        }
                    };
                    return doci.b(vrcVar.iO(arcyVar.a()));
                }
                Object c2 = credentialPickerChimeraActivity.k.c();
                bmgq bmgqVar = credentialPickerChimeraActivity.t;
                fecj v = elfd.a.v();
                String str3 = credentialPickerChimeraActivity.s;
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                elfd elfdVar = (elfd) fecpVar;
                str3.getClass();
                elfdVar.b |= 2;
                elfdVar.e = str3;
                if (!fecpVar.L()) {
                    v.U();
                }
                elfd elfdVar2 = (elfd) v.b;
                elfdVar2.d = 18;
                elfdVar2.b |= 1;
                fecj v2 = eleo.a.v();
                HintRequest hintRequest = (HintRequest) c2;
                boolean z = hintRequest.c;
                if (!v2.b.L()) {
                    v2.U();
                }
                fecp fecpVar2 = v2.b;
                eleo eleoVar = (eleo) fecpVar2;
                eleoVar.b |= 1;
                eleoVar.c = z;
                boolean z2 = hintRequest.d;
                if (!fecpVar2.L()) {
                    v2.U();
                }
                fecp fecpVar3 = v2.b;
                eleo eleoVar2 = (eleo) fecpVar3;
                eleoVar2.b |= 2;
                eleoVar2.d = z2;
                boolean z3 = hintRequest.f;
                if (!fecpVar3.L()) {
                    v2.U();
                }
                eleo eleoVar3 = (eleo) v2.b;
                eleoVar3.b |= 4;
                eleoVar3.e = z3;
                eleo eleoVar4 = (eleo) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                elfd elfdVar3 = (elfd) v.b;
                eleoVar4.getClass();
                elfdVar3.t = eleoVar4;
                elfdVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                bmgqVar.a((elfd) v.Q());
                vrc vrcVar2 = credentialPickerChimeraActivity.r;
                Object c3 = credentialPickerChimeraActivity.k.c();
                arcy arcyVar2 = new arcy();
                arcyVar2.d = 1523;
                final HintRequest hintRequest2 = (HintRequest) c3;
                arcyVar2.a = new arco() { // from class: vqv
                    @Override // defpackage.arco
                    public final void d(Object obj2, Object obj3) {
                        int i3 = vrc.a;
                        ((xue) ((xtv) obj2).H()).e(new vra((dfau) obj3, Credential.class), HintRequest.this);
                    }
                };
                return enps.f(doci.b(vrcVar2.iO(arcyVar2.a())), new eiho() { // from class: yya
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        return eitj.h(eivv.j((eitj) obj2, new eiho() { // from class: yyb
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                return new InternalCredentialWrapper((Credential) obj3, null);
                            }
                        }));
                    }
                }, enre.a);
            }
        }), new yye(this), enre.a);
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        if (isFinishing()) {
            fecj v = ejzo.a.v();
            String str = this.j;
            if (!v.b.L()) {
                v.U();
            }
            ejzo ejzoVar = (ejzo) v.b;
            str.getClass();
            ejzoVar.b |= 32;
            ejzoVar.h = str;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.v;
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            ejzo ejzoVar2 = (ejzo) fecpVar;
            ejzoVar2.b |= 2;
            ejzoVar2.d = elapsedRealtime;
            int i = this.y;
            if (!fecpVar.L()) {
                v.U();
            }
            fecp fecpVar2 = v.b;
            ejzo ejzoVar3 = (ejzo) fecpVar2;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            ejzoVar3.c = i2;
            ejzoVar3.b |= 1;
            boolean z = this.u;
            if (!fecpVar2.L()) {
                v.U();
            }
            ejzo ejzoVar4 = (ejzo) v.b;
            ejzoVar4.b |= 16;
            ejzoVar4.g = z;
            int size = this.n.h() ? ((eitj) this.n.c()).size() : -1;
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar3 = v.b;
            ejzo ejzoVar5 = (ejzo) fecpVar3;
            ejzoVar5.b |= 8;
            ejzoVar5.f = size;
            int i3 = this.x;
            if (i3 != -1) {
                if (!fecpVar3.L()) {
                    v.U();
                }
                ejzo ejzoVar6 = (ejzo) v.b;
                ejzoVar6.b |= 4;
                ejzoVar6.e = i3;
            }
            xuk.a().c((ejzo) v.Q());
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.p.setEnabled(false);
        this.x = i;
        k((InternalCredentialWrapper) ((eitj) this.n.c()).get(i));
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.common.internal.safeparcel.SafeParcelable, java.lang.Object] */
    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("popupTimeMillis", this.v);
        bundle.putBoolean("firstTime", this.u);
        bundle.putString("claimedCallingPackage", aozv.b(this.j));
        if (this.l.h()) {
            bundle.putByteArray("credentialRequest", arxd.n((CredentialRequest) this.l.c()));
        }
        if (this.k.h()) {
            bundle.putByteArray("com.google.android.gms.credentials.HintRequest", arxd.n(this.k.c()));
        }
        if (this.m.h()) {
            bundle.putByteArray("selectedCredential", arxd.n((InternalCredentialWrapper) this.m.c()));
        }
        String str = this.s;
        if (str != null) {
            bundle.putString("logSessionId", str);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.o.isEmpty()) {
            return true;
        }
        Rect rect = new Rect();
        getWindow().getDecorView().getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        m(0, true != this.l.h() ? 103 : 203);
        p(true != this.l.h() ? 104 : 204);
        return true;
    }
}
