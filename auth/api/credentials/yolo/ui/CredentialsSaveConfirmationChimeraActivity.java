package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.accounts.Account;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSaveConfirmationChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aayb;
import defpackage.arcm;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.atzb;
import defpackage.atzs;
import defpackage.aura;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonm;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvh;
import defpackage.ekvi;
import defpackage.ekwb;
import defpackage.eles;
import defpackage.emmz;
import defpackage.ense;
import defpackage.enso;
import defpackage.ensq;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fnfq;
import defpackage.fnje;
import defpackage.rxx;
import defpackage.xnd;
import defpackage.yds;
import defpackage.zrt;
import defpackage.zsh;
import defpackage.zsi;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class CredentialsSaveConfirmationChimeraActivity extends rxx implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    public static final /* synthetic */ int l = 0;
    public String j;
    public boni k;
    private String m;
    private Credential n;
    private boolean o;
    private List p;
    private Account q;
    private long r;
    private xnd s;
    private int t = 1;

    static {
        zsi.a("CredentialsSaveConfirmationActivity");
    }

    private static Spannable a(String str, String str2, String str3, String str4, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new DefensiveURLSpan(str3, z), length, spannableStringBuilder.length(), 33);
        if (!TextUtils.isEmpty(str4)) {
            spannableStringBuilder.append((CharSequence) str4);
        }
        return spannableStringBuilder;
    }

    private final void k(int i, int i2) {
        this.t = i2;
        setResult(i);
        boni boniVar = this.k;
        fgrc v = ensq.a.v();
        String str = this.j;
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
        ensqVar2.d = 17;
        ensqVar2.b |= 1;
        fgrc v2 = enso.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        enso ensoVar = (enso) fgriVar2;
        ensoVar.b |= 1;
        ensoVar.c = i;
        int i3 = i2 - 1;
        if (!fgriVar2.L()) {
            v2.U();
        }
        fgri fgriVar3 = v2.b;
        enso ensoVar2 = (enso) fgriVar3;
        ensoVar2.b |= 2;
        ensoVar2.d = i3;
        if (!fgriVar3.L()) {
            v2.U();
        }
        enso ensoVar3 = (enso) v2.b;
        ensoVar3.f = 202;
        ensoVar3.b |= 8;
        if (!v.b.L()) {
            v.U();
        }
        ensq ensqVar3 = (ensq) v.b;
        enso ensoVar4 = (enso) v2.Q();
        ensoVar4.getClass();
        ensqVar3.s = ensoVar4;
        ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar.a((ensq) v.Q());
        finish();
    }

    private final void l(int i) {
        if (fnje.c()) {
            boni boniVar = this.k;
            fgrc v = ensq.a.v();
            String str = this.j;
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
            String str2 = this.m;
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar2 = v2.b;
            ense enseVar = (ense) fgriVar2;
            str2.getClass();
            enseVar.b |= 8;
            enseVar.f = str2;
            if (!fgriVar2.L()) {
                v2.U();
            }
            ense enseVar2 = (ense) v2.b;
            enseVar2.c = i - 1;
            enseVar2.b |= 1;
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

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        l(405);
        k(0, 404);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.credential_save_reject) {
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                this.s.a((Account) it.next(), this.m, true);
            }
            l(404);
            k(0, 403);
            return;
        }
        if (view.getId() == R.id.credential_save_confirm) {
            xnd xndVar = this.s;
            final Account account = this.q;
            final String str = this.m;
            final Credential credential = this.n;
            atfn atfnVar = new atfn();
            atfnVar.d = 1526;
            atfnVar.a = new atfd() { // from class: xmu
                @Override // defpackage.atfd
                public final void d(Object obj, Object obj2) {
                    int i = xnd.a;
                    ((zsb) ((zrs) obj).H()).g(new xnc((dhma) obj2, Credential.class), account, str, credential);
                }
            };
            xndVar.ji(atfnVar.a());
            this.s.b(this.m);
            l(402);
            k(-1, 401);
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Auth_CredentialsDialog);
        getWindow().setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE, AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        setContentView(R.layout.credential_save_confirmation);
        Bundle bundle2 = (Bundle) ekvh.c(bundle, (Bundle) ekvh.c(getIntent().getExtras(), Bundle.EMPTY));
        byte[] byteArray = bundle2.getByteArray("extra_credentials");
        atzb.s(byteArray);
        this.n = (Credential) atzs.a(byteArray, Credential.CREATOR);
        this.o = bundle2.getBoolean("is_first_use");
        Parcelable[] parcelableArray = bundle2.getParcelableArray("available_accounts");
        atzb.s(parcelableArray);
        this.p = eles.k(parcelableArray).l(new ekut() { // from class: aaxz
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                int i = CredentialsSaveConfirmationChimeraActivity.l;
                return (Account) ((Parcelable) obj);
            }
        }).n();
        Account account = bundle2.get("selected_account") == null ? (Account) this.p.get(0) : (Account) bundle2.getParcelable("selected_account");
        atzb.s(account);
        this.q = account;
        this.r = bundle2.getLong("popup_time_millis", SystemClock.elapsedRealtime());
        String string = bundle2.getString("key_log_session_id");
        atzb.s(string);
        this.j = string;
        atzb.s(string);
        this.s = new xnd(this, new zrt(string));
        this.k = bonh.a(this, null);
        ekvi i = ekvi.i(bundle2.getString("app_id"));
        if (!i.h()) {
            String q = aura.q(this);
            i = q == null ? ektg.a : arcm.a(this, q);
        }
        if (!i.h()) {
            k(0, 2);
            return;
        }
        this.m = (String) i.c();
        if (fnje.c()) {
            bonm.a(this, new ekwb() { // from class: aaya
                @Override // defpackage.ekwb
                public final void lY(Object obj) {
                    CredentialsSaveConfirmationChimeraActivity credentialsSaveConfirmationChimeraActivity = CredentialsSaveConfirmationChimeraActivity.this;
                    credentialsSaveConfirmationChimeraActivity.k.a(bono.b(203, (bonn) obj, credentialsSaveConfirmationChimeraActivity.j));
                }
            });
        }
        findViewById(R.id.credential_save_reject).setOnClickListener(this);
        findViewById(R.id.credential_save_confirm).setOnClickListener(this);
        boolean isEmpty = TextUtils.isEmpty(this.n.e);
        boolean z = this.p.size() > 1;
        if (z) {
            Spinner spinner = (Spinner) findViewById(R.id.credential_save_account);
            spinner.setAdapter((SpinnerAdapter) new aayb(this, this.p));
            spinner.setSelection(this.p.indexOf(this.q));
            spinner.setOnItemSelectedListener(this);
            spinner.setVisibility(0);
        }
        if (this.o) {
            l(510);
            View findViewById = findViewById(R.id.google_logo);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.credential_save_confirmation);
            viewGroup.addView(LayoutInflater.from(this).inflate(R.layout.credentials_warm_welcome, viewGroup, false), 0);
            TextView textView = (TextView) findViewById(R.id.credentials_warm_welcome_text);
            Resources resources = getResources();
            textView.setText(a(resources.getString(R.string.credentials_warm_welcome_prefix), resources.getString(R.string.credentials_warm_welcome_link_text), fnfq.c(), null, true));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            if (Build.VERSION.SDK_INT != 26 && (getResources().getConfiguration().screenLayout & 15) < 3) {
                setRequestedOrientation(1);
            }
            this.s.c();
        }
        TextView textView2 = (TextView) findViewById(R.id.credential_save_text);
        String b = arcm.b(this.m);
        textView2.setText(a(String.format(getString(true != isEmpty ? R.string.credentials_save_password_prefix : R.string.credentials_save_idp_prefix), yds.a(this, b)), getString(R.string.credentials_save_link_text), String.format("%1s://%2s", getString(R.string.credentials_url_scheme), getString(R.string.credentials_settings_host)), getString(true != z ? R.string.credentials_save_suffix_single : R.string.credentials_save_suffix_multiple), false));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button) findViewById(R.id.credential_save_confirm)).setText(getResources().getString(true != isEmpty ? R.string.credentials_save_confirm_password : R.string.credentials_save_confirm_idp));
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        if (isFinishing()) {
            fgrc v = emmz.a.v();
            String str = this.m;
            if (!v.b.L()) {
                v.U();
            }
            emmz emmzVar = (emmz) v.b;
            str.getClass();
            emmzVar.b |= 32;
            emmzVar.h = str;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.r;
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            emmz emmzVar2 = (emmz) fgriVar;
            emmzVar2.b |= 2;
            emmzVar2.d = elapsedRealtime;
            int i = this.t;
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
            boolean z = this.o;
            if (!fgriVar2.L()) {
                v.U();
            }
            emmz emmzVar4 = (emmz) v.b;
            emmzVar4.b |= 16;
            emmzVar4.g = z;
            zsh.a().c((emmz) v.Q());
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.q = (Account) this.p.get(i);
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("app_id", this.m);
        bundle.putByteArray("extra_credentials", atzs.n(this.n));
        bundle.putBoolean("is_first_use", this.o);
        bundle.putParcelable("selected_account", this.q);
        bundle.putParcelableArray("available_accounts", (Parcelable[]) this.p.toArray(new Account[0]));
        bundle.putLong("popup_time_millis", this.r);
        bundle.putString("key_log_session_id", this.j);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Rect rect = new Rect();
        getWindow().getDecorView().getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        l(403);
        k(0, 402);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
