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
import defpackage.aozv;
import defpackage.arco;
import defpackage.arcy;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.asng;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgu;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiic;
import defpackage.eiid;
import defpackage.eiiw;
import defpackage.eirn;
import defpackage.ejzo;
import defpackage.eler;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkox;
import defpackage.fksf;
import defpackage.qet;
import defpackage.vrc;
import defpackage.whm;
import defpackage.xtw;
import defpackage.xuk;
import defpackage.xul;
import defpackage.yyl;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class CredentialsSaveConfirmationChimeraActivity extends qet implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    public static final /* synthetic */ int l = 0;
    public String j;
    public bmgq k;
    private String m;
    private Credential n;
    private boolean o;
    private List p;
    private Account q;
    private long r;
    private vrc s;
    private int t = 1;

    static {
        xul.a("CredentialsSaveConfirmationActivity");
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
        bmgq bmgqVar = this.k;
        fecj v = elfd.a.v();
        String str = this.j;
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
        elfdVar2.d = 17;
        elfdVar2.b |= 1;
        fecj v2 = elfb.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        elfb elfbVar = (elfb) fecpVar2;
        elfbVar.b |= 1;
        elfbVar.c = i;
        int i3 = i2 - 1;
        if (!fecpVar2.L()) {
            v2.U();
        }
        fecp fecpVar3 = v2.b;
        elfb elfbVar2 = (elfb) fecpVar3;
        elfbVar2.b |= 2;
        elfbVar2.d = i3;
        if (!fecpVar3.L()) {
            v2.U();
        }
        elfb elfbVar3 = (elfb) v2.b;
        elfbVar3.f = 202;
        elfbVar3.b |= 8;
        if (!v.b.L()) {
            v.U();
        }
        elfd elfdVar3 = (elfd) v.b;
        elfb elfbVar4 = (elfb) v2.Q();
        elfbVar4.getClass();
        elfdVar3.s = elfbVar4;
        elfdVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bmgqVar.a((elfd) v.Q());
        finish();
    }

    private final void l(int i) {
        if (fksf.c()) {
            bmgq bmgqVar = this.k;
            fecj v = elfd.a.v();
            String str = this.j;
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
            String str2 = this.m;
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar2 = v2.b;
            eler elerVar = (eler) fecpVar2;
            str2.getClass();
            elerVar.b |= 8;
            elerVar.f = str2;
            if (!fecpVar2.L()) {
                v2.U();
            }
            eler elerVar2 = (eler) v2.b;
            elerVar2.c = i - 1;
            elerVar2.b |= 1;
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

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
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
            vrc vrcVar = this.s;
            final Account account = this.q;
            final String str = this.m;
            final Credential credential = this.n;
            arcy arcyVar = new arcy();
            arcyVar.d = 1526;
            arcyVar.a = new arco() { // from class: vqt
                @Override // defpackage.arco
                public final void d(Object obj, Object obj2) {
                    int i = vrc.a;
                    ((xue) ((xtv) obj).H()).g(new vrb((dfau) obj2, Credential.class), account, str, credential);
                }
            };
            vrcVar.iT(arcyVar.a());
            this.s.b(this.m);
            l(402);
            k(-1, 401);
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Auth_CredentialsDialog);
        getWindow().setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE, AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        setContentView(R.layout.credential_save_confirmation);
        Bundle bundle2 = (Bundle) eiic.c(bundle, (Bundle) eiic.c(getIntent().getExtras(), Bundle.EMPTY));
        byte[] byteArray = bundle2.getByteArray("extra_credentials");
        arwm.s(byteArray);
        this.n = (Credential) arxd.a(byteArray, Credential.CREATOR);
        this.o = bundle2.getBoolean("is_first_use");
        Parcelable[] parcelableArray = bundle2.getParcelableArray("available_accounts");
        arwm.s(parcelableArray);
        this.p = eirn.k(parcelableArray).l(new eiho() { // from class: yyj
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                int i = CredentialsSaveConfirmationChimeraActivity.l;
                return (Account) ((Parcelable) obj);
            }
        }).n();
        Account account = bundle2.get("selected_account") == null ? (Account) this.p.get(0) : (Account) bundle2.getParcelable("selected_account");
        arwm.s(account);
        this.q = account;
        this.r = bundle2.getLong("popup_time_millis", SystemClock.elapsedRealtime());
        String string = bundle2.getString("key_log_session_id");
        arwm.s(string);
        this.j = string;
        arwm.s(string);
        this.s = new vrc(this, new xtw(string));
        this.k = bmgp.a(this, null);
        eiid i = eiid.i(bundle2.getString("app_id"));
        if (!i.h()) {
            String q = asng.q(this);
            i = q == null ? eigb.a : aozv.a(this, q);
        }
        if (!i.h()) {
            k(0, 2);
            return;
        }
        this.m = (String) i.c();
        if (fksf.c()) {
            bmgu.a(this, new eiiw() { // from class: yyk
                @Override // defpackage.eiiw
                public final void lB(Object obj) {
                    CredentialsSaveConfirmationChimeraActivity credentialsSaveConfirmationChimeraActivity = CredentialsSaveConfirmationChimeraActivity.this;
                    credentialsSaveConfirmationChimeraActivity.k.a(bmgw.b(203, (bmgv) obj, credentialsSaveConfirmationChimeraActivity.j));
                }
            });
        }
        findViewById(R.id.credential_save_reject).setOnClickListener(this);
        findViewById(R.id.credential_save_confirm).setOnClickListener(this);
        boolean isEmpty = TextUtils.isEmpty(this.n.e);
        boolean z = this.p.size() > 1;
        if (z) {
            Spinner spinner = (Spinner) findViewById(R.id.credential_save_account);
            spinner.setAdapter((SpinnerAdapter) new yyl(this, this.p));
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
            textView.setText(a(resources.getString(R.string.credentials_warm_welcome_prefix), resources.getString(R.string.credentials_warm_welcome_link_text), fkox.c(), null, true));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            if (Build.VERSION.SDK_INT != 26 && (getResources().getConfiguration().screenLayout & 15) < 3) {
                setRequestedOrientation(1);
            }
            this.s.c();
        }
        TextView textView2 = (TextView) findViewById(R.id.credential_save_text);
        String b = aozv.b(this.m);
        textView2.setText(a(String.format(getString(true != isEmpty ? R.string.credentials_save_password_prefix : R.string.credentials_save_idp_prefix), whm.a(this, b)), getString(R.string.credentials_save_link_text), String.format("%1s://%2s", getString(R.string.credentials_url_scheme), getString(R.string.credentials_settings_host)), getString(true != z ? R.string.credentials_save_suffix_single : R.string.credentials_save_suffix_multiple), false));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button) findViewById(R.id.credential_save_confirm)).setText(getResources().getString(true != isEmpty ? R.string.credentials_save_confirm_password : R.string.credentials_save_confirm_idp));
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        if (isFinishing()) {
            fecj v = ejzo.a.v();
            String str = this.m;
            if (!v.b.L()) {
                v.U();
            }
            ejzo ejzoVar = (ejzo) v.b;
            str.getClass();
            ejzoVar.b |= 32;
            ejzoVar.h = str;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.r;
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            ejzo ejzoVar2 = (ejzo) fecpVar;
            ejzoVar2.b |= 2;
            ejzoVar2.d = elapsedRealtime;
            int i = this.t;
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
            boolean z = this.o;
            if (!fecpVar2.L()) {
                v.U();
            }
            ejzo ejzoVar4 = (ejzo) v.b;
            ejzoVar4.b |= 16;
            ejzoVar4.g = z;
            xuk.a().c((ejzo) v.Q());
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.q = (Account) this.p.get(i);
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("app_id", this.m);
        bundle.putByteArray("extra_credentials", arxd.n(this.n));
        bundle.putBoolean("is_first_use", this.o);
        bundle.putParcelable("selected_account", this.q);
        bundle.putParcelableArray("available_accounts", (Parcelable[]) this.p.toArray(new Account[0]));
        bundle.putLong("popup_time_millis", this.r);
        bundle.putString("key_log_session_id", this.j);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
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
