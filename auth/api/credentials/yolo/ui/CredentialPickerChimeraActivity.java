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
import defpackage.aaxu;
import defpackage.aaxv;
import defpackage.aaxw;
import defpackage.aaxx;
import defpackage.arcm;
import defpackage.asxe;
import defpackage.atzb;
import defpackage.atzs;
import defpackage.auqv;
import defpackage.auqx;
import defpackage.aura;
import defpackage.bojs;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonm;
import defpackage.bonp;
import defpackage.ektg;
import defpackage.ekus;
import defpackage.ekvh;
import defpackage.ekvi;
import defpackage.ekvm;
import defpackage.ekwb;
import defpackage.ekww;
import defpackage.elgo;
import defpackage.elja;
import defpackage.elpg;
import defpackage.emmz;
import defpackage.enqt;
import defpackage.ense;
import defpackage.enso;
import defpackage.ensq;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fnfq;
import defpackage.fnje;
import defpackage.rxx;
import defpackage.xmj;
import defpackage.xnd;
import defpackage.zrt;
import defpackage.zsh;
import defpackage.zsj;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CredentialPickerChimeraActivity extends rxx implements View.OnClickListener, AdapterView.OnItemClickListener {
    public String j;
    public ekvi k;
    public ekvi l;
    public ekvi m;
    public aaxx o;
    public ListView p;
    public auqv q;
    public xnd r;
    public String s;
    public boni t;
    private boolean u;
    private long v;
    private bojs w;
    private int x;
    public ekvi n = ektg.a;
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
        fgrc v = enso.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        enso ensoVar = (enso) fgriVar;
        ensoVar.b |= 1;
        ensoVar.c = i;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        enso ensoVar2 = (enso) fgriVar2;
        ensoVar2.b |= 2;
        ensoVar2.d = i3;
        if (!fgriVar2.L()) {
            v.U();
        }
        enso ensoVar3 = (enso) v.b;
        ensoVar3.f = 201;
        ensoVar3.b |= 8;
        fgrc v2 = enqt.a.v();
        if (credential != null && this.k.h()) {
            Pattern pattern = Patterns.EMAIL_ADDRESS;
            String str = credential.a;
            int i4 = pattern.matcher(str).matches() ? 2 : Patterns.PHONE.matcher(str).matches() ? 3 : 1;
            if (!v2.b.L()) {
                v2.U();
            }
            enqt enqtVar = (enqt) v2.b;
            enqtVar.c = i4 - 1;
            enqtVar.b |= 1;
        }
        enqt enqtVar2 = (enqt) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        enso ensoVar4 = (enso) v.b;
        enqtVar2.getClass();
        ensoVar4.i = enqtVar2;
        ensoVar4.b |= 64;
        boni boniVar = this.t;
        if (this.n.h()) {
            ekvi c = elja.c(this.n.c(), new ekvm() { // from class: aaxp
                @Override // defpackage.ekvm
                public final boolean a(Object obj) {
                    return ((InternalCredentialWrapper) obj).b != null;
                }
            });
            if (c.h()) {
                boniVar = bonh.a(this, ((InternalCredentialWrapper) c.c()).b.name);
            }
        }
        fgrc v3 = ensq.a.v();
        String str2 = this.s;
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar3 = v3.b;
        ensq ensqVar = (ensq) fgriVar3;
        str2.getClass();
        ensqVar.b = 2 | ensqVar.b;
        ensqVar.e = str2;
        if (!fgriVar3.L()) {
            v3.U();
        }
        fgri fgriVar4 = v3.b;
        ensq ensqVar2 = (ensq) fgriVar4;
        ensqVar2.d = 17;
        ensqVar2.b |= 1;
        if (!fgriVar4.L()) {
            v3.U();
        }
        ensq ensqVar3 = (ensq) v3.b;
        enso ensoVar5 = (enso) v.Q();
        ensoVar5.getClass();
        ensqVar3.s = ensoVar5;
        ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar.a((ensq) v3.Q());
        setResult(i, intent);
        finish();
    }

    private final void p(int i) {
        if (fnje.c()) {
            boni boniVar = this.t;
            fgrc v = ensq.a.v();
            String str = this.s;
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            ensq ensqVar = (ensq) fgriVar;
            str.getClass();
            ensqVar.b |= 2;
            ensqVar.e = str;
            if (!fgriVar.L()) {
                v.U();
            }
            ensq ensqVar2 = (ensq) v.b;
            ensqVar2.d = 6;
            ensqVar2.b |= 1;
            fgrc v2 = ense.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar2 = v2.b;
            ense enseVar = (ense) fgriVar2;
            enseVar.c = i - 1;
            enseVar.b |= 1;
            String str2 = this.j;
            if (!fgriVar2.L()) {
                v2.U();
            }
            ense enseVar2 = (ense) v2.b;
            str2.getClass();
            enseVar2.b |= 8;
            enseVar2.f = str2;
            ense enseVar3 = (ense) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            ensq ensqVar3 = (ensq) v.b;
            enseVar3.getClass();
            ensqVar3.j = enseVar3;
            ensqVar3.b |= 64;
            boniVar.a((ensq) v.Q());
        }
    }

    public final CredentialPickerConfig a() {
        return this.k.h() ? ((HintRequest) this.k.c()).b : ((CredentialRequest) this.l.c()).d;
    }

    public final void k(final InternalCredentialWrapper internalCredentialWrapper) {
        this.p.postDelayed(new Runnable() { // from class: aaxo
            @Override // java.lang.Runnable
            public final void run() {
                CredentialPickerChimeraActivity.this.l();
            }
        }, 400L);
        this.r.b(this.j);
        this.m = ekvi.j(internalCredentialWrapper);
        if (this.l.h()) {
            final Account account = internalCredentialWrapper.b;
            atzb.s(account);
            eqgc.t(this.w.b(2, new ekww() { // from class: aaxn
                @Override // defpackage.ekww
                public final Object lK() {
                    CredentialPickerChimeraActivity credentialPickerChimeraActivity = CredentialPickerChimeraActivity.this;
                    xnd xndVar = credentialPickerChimeraActivity.r;
                    final String str = credentialPickerChimeraActivity.j;
                    final boolean z = ((CredentialRequest) credentialPickerChimeraActivity.l.c()).f;
                    final String str2 = ((CredentialRequest) credentialPickerChimeraActivity.l.c()).g;
                    final String str3 = ((CredentialRequest) credentialPickerChimeraActivity.l.c()).h;
                    atfn atfnVar = new atfn();
                    atfnVar.d = 1524;
                    final Account account2 = account;
                    final Credential credential = internalCredentialWrapper.a;
                    atfnVar.a = new atfd() { // from class: xmq
                        @Override // defpackage.atfd
                        public final void d(Object obj, Object obj2) {
                            int i = xnd.a;
                            ((zsb) ((zrs) obj).H()).c(new xnc((dhma) obj2, Credential.class), account2, str, credential, z, str2, str3);
                        }
                    };
                    return dqmr.b(xndVar.jd(atfnVar.a()));
                }
            }), new aaxv(this), eqex.a);
        } else {
            final Credential credential = internalCredentialWrapper.a;
            xmj xmjVar = new xmj(credential);
            int i = elgo.d;
            xmjVar.c = elpg.a;
            final ekvi c = elja.c(auqx.h(this, getPackageName()), new ekvm() { // from class: aaxk
                @Override // defpackage.ekvm
                public final boolean a(Object obj) {
                    return ((Account) obj).name.equals(Credential.this.a);
                }
            });
            if (((HintRequest) this.k.c()).f && c.h()) {
                eqgc.t(this.w.b(2, new ekww() { // from class: aaxl
                    @Override // defpackage.ekww
                    public final Object lK() {
                        ekvi ekviVar = c;
                        CredentialPickerChimeraActivity credentialPickerChimeraActivity = CredentialPickerChimeraActivity.this;
                        xnd xndVar = credentialPickerChimeraActivity.r;
                        final Account account2 = (Account) ekviVar.c();
                        final String str = credentialPickerChimeraActivity.j;
                        final String str2 = ((HintRequest) credentialPickerChimeraActivity.k.c()).g;
                        final String str3 = ((HintRequest) credentialPickerChimeraActivity.k.c()).h;
                        atfn atfnVar = new atfn();
                        atfnVar.d = 1525;
                        atfnVar.a = new atfd() { // from class: xmr
                            @Override // defpackage.atfd
                            public final void d(Object obj, Object obj2) {
                                int i2 = xnd.a;
                                ((zsb) ((zrs) obj).H()).f(new xnc((dhma) obj2, IdToken.class), account2, str, str2, str3);
                            }
                        };
                        return dqmr.b(xndVar.jd(atfnVar.a()));
                    }
                }), new aaxw(this, xmjVar), eqex.a);
            } else {
                o(-1, 101, xmjVar.a());
            }
        }
        int i2 = this.x;
        if (fnje.c()) {
            boni boniVar = this.t;
            fgrc v = ensq.a.v();
            String str = this.s;
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            ensq ensqVar = (ensq) fgriVar;
            str.getClass();
            ensqVar.b |= 2;
            ensqVar.e = str;
            if (!fgriVar.L()) {
                v.U();
            }
            ensq ensqVar2 = (ensq) v.b;
            ensqVar2.d = 6;
            ensqVar2.b |= 1;
            fgrc v2 = ense.a.v();
            int i3 = true != this.l.h() ? 102 : 202;
            if (!v2.b.L()) {
                v2.U();
            }
            ense enseVar = (ense) v2.b;
            enseVar.c = i3 - 1;
            enseVar.b |= 1;
            int size = ((elgo) this.n.c()).size();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar2 = v2.b;
            ense enseVar2 = (ense) fgriVar2;
            enseVar2.b |= 4;
            enseVar2.e = size;
            if (!fgriVar2.L()) {
                v2.U();
            }
            fgri fgriVar3 = v2.b;
            ense enseVar3 = (ense) fgriVar3;
            enseVar3.b = 2 | enseVar3.b;
            enseVar3.d = i2;
            String str2 = this.j;
            if (!fgriVar3.L()) {
                v2.U();
            }
            ense enseVar4 = (ense) v2.b;
            str2.getClass();
            enseVar4.b |= 8;
            enseVar4.f = str2;
            ense enseVar5 = (ense) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            ensq ensqVar3 = (ensq) v.b;
            enseVar5.getClass();
            ensqVar3.j = enseVar5;
            ensqVar3.b |= 64;
            boniVar.a((ensq) v.Q());
            if (this.l.h()) {
                this.t.a(zsj.d(this.s, ((InternalCredentialWrapper) ((elgo) this.n.c()).get(i2)).a));
            }
        }
    }

    public final void l() {
        this.p.setEnabled(false);
        View findViewById = findViewById(R.id.progress_indicator_container);
        ImageView imageView = (ImageView) findViewById(R.id.progress_indicator);
        findViewById.setVisibility(0);
        if (this.q == null) {
            auqv auqvVar = new auqv(getContainerActivity(), findViewById(R.id.progress_indicator));
            this.q = auqvVar;
            auqvVar.setAlpha(255);
            this.q.c(0);
            this.q.a(-12417548);
        }
        imageView.setImageDrawable(this.q);
        this.q.start();
    }

    public final void m(int i, int i2) {
        o(i, i2, null);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        ekvi j;
        String string;
        super.onCreate(bundle);
        setTheme(R.style.Auth_CredentialsDialog);
        Bundle bundle2 = (Bundle) ekvh.c(bundle, (Bundle) ekvh.c(getIntent().getExtras(), Bundle.EMPTY));
        ClassLoader classLoader = CredentialRequest.class.getClassLoader();
        atzb.s(classLoader);
        bundle2.setClassLoader(classLoader);
        String q = aura.q(this);
        if (q == null) {
            j = ektg.a;
        } else {
            String string2 = bundle2.getString("claimedCallingPackage");
            j = (string2 == null || ekus.a(q, string2)) ? ekvi.j(q) : !asxe.d(this).h(q) ? ektg.a : ekvi.j(string2);
        }
        ekvi a = !j.h() ? ektg.a : arcm.a(this, (String) j.c());
        this.u = bundle2.getBoolean("firstTime");
        if (TextUtils.isEmpty(bundle2.getString("logSessionId"))) {
            string = bonp.a();
        } else {
            string = bundle2.getString("logSessionId");
            atzb.s(string);
        }
        this.s = string;
        this.v = bundle2.getLong("popupTimeMillis", SystemClock.elapsedRealtime());
        ektg ektgVar = ektg.a;
        this.l = ektgVar;
        byte[] byteArray = bundle2.getByteArray("credentialRequest");
        if (byteArray != null) {
            this.l = ekvi.i((CredentialRequest) atzs.a(byteArray, CredentialRequest.CREATOR));
        }
        Object obj = bundle2.get("com.google.android.gms.credentials.HintRequest");
        this.k = obj == null ? ektgVar : obj instanceof byte[] ? ekvi.j((HintRequest) atzs.a((byte[]) obj, HintRequest.CREATOR)) : ekvi.j((HintRequest) obj);
        this.m = ektgVar;
        byte[] byteArray2 = bundle2.getByteArray("selectedCredential");
        if (byteArray2 != null) {
            this.m = ekvi.i((InternalCredentialWrapper) atzs.a(byteArray2, InternalCredentialWrapper.CREATOR));
        }
        this.t = bonh.a(this, null);
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
        this.w = bojs.a(this);
        String str = this.s;
        atzb.s(str);
        this.r = new xnd(this, new zrt(str));
        if (this.l.h()) {
            setContentView(R.layout.credential_picker_activity);
        } else {
            setContentView(R.layout.credential_hint_picker_activity);
        }
        findViewById(R.id.credential_picker_layout).setContentDescription(getString(true != this.l.h() ? R.string.credentials_hint_ally_announce : R.string.credentials_picker_ally_announce));
        findViewById(R.id.add_account).setVisibility(8);
        this.p = (ListView) findViewById(R.id.credential_picker_options);
        aaxx aaxxVar = new aaxx(this, new ArrayList());
        this.o = aaxxVar;
        this.p.setAdapter((ListAdapter) aaxxVar);
        this.p.setOnItemClickListener(this);
        TextView textView = (TextView) findViewById(R.id.credentials_warm_welcome_text);
        if (textView != null) {
            Resources resources = getResources();
            String string3 = resources.getString(R.string.credentials_warm_welcome_prefix);
            String string4 = resources.getString(R.string.credentials_warm_welcome_link_text);
            String c = fnfq.c();
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
        if (fnje.c()) {
            bonm.a(this, new ekwb() { // from class: aaxs
                @Override // defpackage.ekwb
                public final void lY(Object obj2) {
                    CredentialPickerChimeraActivity credentialPickerChimeraActivity = CredentialPickerChimeraActivity.this;
                    credentialPickerChimeraActivity.t.a(bono.b(202, (bonn) obj2, credentialPickerChimeraActivity.s));
                }
            });
        }
        eqgc.t(this.w.b(1, new ekww() { // from class: aaxt
            @Override // defpackage.ekww
            public final Object lK() {
                CredentialPickerChimeraActivity credentialPickerChimeraActivity = CredentialPickerChimeraActivity.this;
                if (credentialPickerChimeraActivity.l.h()) {
                    xnd xndVar = credentialPickerChimeraActivity.r;
                    final String str2 = credentialPickerChimeraActivity.j;
                    final CredentialRequest credentialRequest = (CredentialRequest) credentialPickerChimeraActivity.l.c();
                    atfn atfnVar = new atfn();
                    atfnVar.d = 1522;
                    atfnVar.a = new atfd() { // from class: xmn
                        @Override // defpackage.atfd
                        public final void d(Object obj2, Object obj3) {
                            int i3 = xnd.a;
                            ((zsb) ((zrs) obj2).H()).d(new xnb((dhma) obj3, InternalCredentialWrapper.class), str2, credentialRequest);
                        }
                    };
                    return dqmr.b(xndVar.jd(atfnVar.a()));
                }
                Object c2 = credentialPickerChimeraActivity.k.c();
                boni boniVar = credentialPickerChimeraActivity.t;
                fgrc v = ensq.a.v();
                String str3 = credentialPickerChimeraActivity.s;
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                ensq ensqVar = (ensq) fgriVar;
                str3.getClass();
                ensqVar.b |= 2;
                ensqVar.e = str3;
                if (!fgriVar.L()) {
                    v.U();
                }
                ensq ensqVar2 = (ensq) v.b;
                ensqVar2.d = 18;
                ensqVar2.b |= 1;
                fgrc v2 = ensb.a.v();
                HintRequest hintRequest = (HintRequest) c2;
                boolean z = hintRequest.c;
                if (!v2.b.L()) {
                    v2.U();
                }
                fgri fgriVar2 = v2.b;
                ensb ensbVar = (ensb) fgriVar2;
                ensbVar.b |= 1;
                ensbVar.c = z;
                boolean z2 = hintRequest.d;
                if (!fgriVar2.L()) {
                    v2.U();
                }
                fgri fgriVar3 = v2.b;
                ensb ensbVar2 = (ensb) fgriVar3;
                ensbVar2.b |= 2;
                ensbVar2.d = z2;
                boolean z3 = hintRequest.f;
                if (!fgriVar3.L()) {
                    v2.U();
                }
                ensb ensbVar3 = (ensb) v2.b;
                ensbVar3.b |= 4;
                ensbVar3.e = z3;
                ensb ensbVar4 = (ensb) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                ensq ensqVar3 = (ensq) v.b;
                ensbVar4.getClass();
                ensqVar3.t = ensbVar4;
                ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                boniVar.a((ensq) v.Q());
                xnd xndVar2 = credentialPickerChimeraActivity.r;
                Object c3 = credentialPickerChimeraActivity.k.c();
                atfn atfnVar2 = new atfn();
                atfnVar2.d = 1523;
                final HintRequest hintRequest2 = (HintRequest) c3;
                atfnVar2.a = new atfd() { // from class: xmw
                    @Override // defpackage.atfd
                    public final void d(Object obj2, Object obj3) {
                        int i3 = xnd.a;
                        ((zsb) ((zrs) obj2).H()).e(new xnb((dhma) obj3, Credential.class), HintRequest.this);
                    }
                };
                return eqdl.f(dqmr.b(xndVar2.jd(atfnVar2.a())), new ekut() { // from class: aaxq
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        return elgo.h(elja.j((elgo) obj2, new ekut() { // from class: aaxr
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                return new InternalCredentialWrapper((Credential) obj3, null);
                            }
                        }));
                    }
                }, eqex.a);
            }
        }), new aaxu(this), eqex.a);
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        if (isFinishing()) {
            fgrc v = emmz.a.v();
            String str = this.j;
            if (!v.b.L()) {
                v.U();
            }
            emmz emmzVar = (emmz) v.b;
            str.getClass();
            emmzVar.b |= 32;
            emmzVar.h = str;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.v;
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            emmz emmzVar2 = (emmz) fgriVar;
            emmzVar2.b |= 2;
            emmzVar2.d = elapsedRealtime;
            int i = this.y;
            if (!fgriVar.L()) {
                v.U();
            }
            fgri fgriVar2 = v.b;
            emmz emmzVar3 = (emmz) fgriVar2;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            emmzVar3.c = i2;
            emmzVar3.b |= 1;
            boolean z = this.u;
            if (!fgriVar2.L()) {
                v.U();
            }
            emmz emmzVar4 = (emmz) v.b;
            emmzVar4.b |= 16;
            emmzVar4.g = z;
            int size = this.n.h() ? ((elgo) this.n.c()).size() : -1;
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar3 = v.b;
            emmz emmzVar5 = (emmz) fgriVar3;
            emmzVar5.b |= 8;
            emmzVar5.f = size;
            int i3 = this.x;
            if (i3 != -1) {
                if (!fgriVar3.L()) {
                    v.U();
                }
                emmz emmzVar6 = (emmz) v.b;
                emmzVar6.b |= 4;
                emmzVar6.e = i3;
            }
            zsh.a().c((emmz) v.Q());
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.p.setEnabled(false);
        this.x = i;
        k((InternalCredentialWrapper) ((elgo) this.n.c()).get(i));
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.common.internal.safeparcel.SafeParcelable, java.lang.Object] */
    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("popupTimeMillis", this.v);
        bundle.putBoolean("firstTime", this.u);
        bundle.putString("claimedCallingPackage", arcm.b(this.j));
        if (this.l.h()) {
            bundle.putByteArray("credentialRequest", atzs.n((CredentialRequest) this.l.c()));
        }
        if (this.k.h()) {
            bundle.putByteArray("com.google.android.gms.credentials.HintRequest", atzs.n(this.k.c()));
        }
        if (this.m.h()) {
            bundle.putByteArray("selectedCredential", atzs.n((InternalCredentialWrapper) this.m.c()));
        }
        String str = this.s;
        if (str != null) {
            bundle.putString("logSessionId", str);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
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
