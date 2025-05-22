package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.internal.AccountCredentialSettings;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.aayr;
import defpackage.aays;
import defpackage.aayt;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.atpj;
import defpackage.atzb;
import defpackage.auiq;
import defpackage.auqv;
import defpackage.ausn;
import defpackage.auts;
import defpackage.auvu;
import defpackage.auvv;
import defpackage.auwr;
import defpackage.bojs;
import defpackage.bonp;
import defpackage.ekus;
import defpackage.ekut;
import defpackage.ekvh;
import defpackage.ekvm;
import defpackage.ekww;
import defpackage.ekxc;
import defpackage.elgo;
import defpackage.elja;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.emmz;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.fgrc;
import defpackage.fnfq;
import defpackage.ig;
import defpackage.itn;
import defpackage.rxx;
import defpackage.xnd;
import defpackage.yid;
import defpackage.zrt;
import defpackage.zsh;
import defpackage.zsi;
import java.util.List;
import java.util.TreeSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CredentialsSettingsChimeraActivity extends rxx implements CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener, View.OnClickListener {
    public static final /* synthetic */ int r = 0;
    private static final ausn s = zsi.a("CredentialsSettingsChimeraActivity");
    public SwitchCompat j;
    public SwitchCompat k;
    public ViewGroup l;
    public xnd m;
    public View n;
    public View o;
    public AccountCredentialSettings p;
    public Account q;
    private auvv t;
    private View u;
    private View v;
    private TextView w;
    private bojs x;
    private auqv y;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class SettingsIntentOperation extends apzq {
        @Override // defpackage.apzq
        public final GoogleSettingsItem b() {
            if (!((Boolean) yid.a.b()).booleanValue()) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.settings.CREDENTIALS_SETTINGS"), 4, R.string.common_google_settings_credentials_title, aqlc.CREDENTIALS_ITEM, auiq.DEFAULT_AUTH_CREDENTIALS_BASE);
            googleSettingsItem.e = true;
            return googleSettingsItem;
        }
    }

    public static emmz r(int i) {
        fgrc v = emmz.a.v();
        if (!v.b.L()) {
            v.U();
        }
        emmz emmzVar = (emmz) v.b;
        emmzVar.c = i - 1;
        emmzVar.b |= 1;
        return (emmz) v.Q();
    }

    private final void s(Account account) {
        if (ekus.a(account, this.q)) {
            return;
        }
        this.q = account;
        m(true);
        q();
    }

    public final itn a(String str) {
        try {
            return auwr.b(this).g(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new itn(str, null);
        }
    }

    public final void k() {
        boolean b = auts.b(this);
        this.v.setVisibility(true != b ? 0 : 8);
        n(b);
    }

    public final void l(View view, String str) {
        itn a = a(str);
        ImageView imageView = (ImageView) view.findViewById(R.id.credentials_app_image);
        imageView.setImageDrawable((Drawable) a.b);
        CharSequence charSequence = (CharSequence) a.a;
        imageView.setContentDescription(String.format(getString(R.string.credentials_pref_app_icon_description), charSequence));
        ((TextView) view.findViewById(R.id.credentials_app_name)).setText(charSequence);
        view.findViewById(R.id.credentials_app_credential_name).setVisibility(8);
    }

    public final void m(boolean z) {
        findViewById(R.id.progress_indicator_container).setVisibility(true != z ? 8 : 0);
        ImageView imageView = (ImageView) findViewById(R.id.progress_indicator);
        this.o.setVisibility(8);
        if (this.y == null) {
            auqv auqvVar = new auqv(this, imageView);
            this.y = auqvVar;
            auqvVar.setAlpha(255);
            this.y.c(0);
            this.y.a(-12417548);
            imageView.setImageDrawable(this.y);
        }
        if (z) {
            this.y.start();
        } else {
            this.y.stop();
        }
    }

    public final void n(boolean z) {
        this.j.setEnabled(z);
        this.k.setEnabled(z);
        this.l.setEnabled(z);
    }

    public final void o(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            ((eluo) s.i()).x("Unable to find the browser.");
            Toast.makeText(getContainerActivity(), getResources().getString(R.string.common_no_browser_found), 1).show();
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, final boolean z) {
        if (this.p == null) {
            return;
        }
        if (compoundButton.getId() == this.j.getId()) {
            if (this.p.a != z) {
                p(2, new ekww() { // from class: aayf
                    @Override // defpackage.ekww
                    public final Object lK() {
                        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = CredentialsSettingsChimeraActivity.this;
                        final Account account = credentialsSettingsChimeraActivity.q;
                        atzb.s(account);
                        xnd xndVar = credentialsSettingsChimeraActivity.m;
                        atfn atfnVar = new atfn();
                        atfnVar.d = 1529;
                        final boolean z2 = z;
                        atfnVar.a = new atfd() { // from class: xmv
                            @Override // defpackage.atfd
                            public final void d(Object obj, Object obj2) {
                                int i = xnd.a;
                                ((zsb) ((zrs) obj).H()).p(new xna((dhma) obj2), account, z2);
                            }
                        };
                        return dqmr.b(xndVar.ji(atfnVar.a()));
                    }
                }, getString(R.string.credentials_pref_failed_save_storage_enabled));
                zsh.a().c(r(true != z ? 501 : 502));
                return;
            }
            return;
        }
        if (compoundButton.getId() != this.k.getId() || this.p.b == z) {
            return;
        }
        p(3, new ekww() { // from class: aayg
            @Override // defpackage.ekww
            public final Object lK() {
                CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = CredentialsSettingsChimeraActivity.this;
                final Account account = credentialsSettingsChimeraActivity.q;
                atzb.s(account);
                xnd xndVar = credentialsSettingsChimeraActivity.m;
                atfn atfnVar = new atfn();
                atfnVar.d = 1530;
                final boolean z2 = z;
                atfnVar.a = new atfd() { // from class: xmx
                    @Override // defpackage.atfd
                    public final void d(Object obj, Object obj2) {
                        int i = xnd.a;
                        ((zsb) ((zrs) obj).H()).m(new xna((dhma) obj2), account, z2);
                    }
                };
                return dqmr.b(xndVar.ji(atfnVar.a()));
            }
        }, getString(R.string.credentials_pref_failed_save_auto_signin));
        zsh.a().c(r(true != z ? 503 : 504));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        final elgo i;
        View view2 = this.u;
        if (view2 == null || view == null || view2.getId() != view.getId()) {
            return;
        }
        List<ApplicationInfo> installedApplications = getPackageManager().getInstalledApplications(128);
        if (installedApplications == null) {
            ((eluo) s.i()).x("Unable to get any apps.");
            int i2 = elgo.d;
            i = elpg.a;
        } else {
            Iterable j = elja.j(elja.d(installedApplications, new ekvm() { // from class: aayn
                @Override // defpackage.ekvm
                public final boolean a(Object obj) {
                    int i3 = CredentialsSettingsChimeraActivity.r;
                    return (((ApplicationInfo) obj).flags & 1) == 0;
                }
            }), new ekut() { // from class: aayd
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    int i3 = CredentialsSettingsChimeraActivity.r;
                    return ((ApplicationInfo) obj).packageName;
                }
            });
            TreeSet treeSet = new TreeSet();
            elja.t(treeSet, j);
            treeSet.removeAll(this.p.c);
            i = elgo.i(treeSet);
        }
        new AlertDialog.Builder(this).setTitle(getResources().getString(R.string.credentials_add_never_save_app_dialog_title)).setAdapter(new aayt(this, this, i), new DialogInterface.OnClickListener() { // from class: aayj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                String str = (String) i.get(i3);
                final CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = CredentialsSettingsChimeraActivity.this;
                final ekvi a = arcm.a(credentialsSettingsChimeraActivity, str);
                if (a.h()) {
                    credentialsSettingsChimeraActivity.p(4, new ekww() { // from class: aayh
                        @Override // defpackage.ekww
                        public final Object lK() {
                            CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity2 = CredentialsSettingsChimeraActivity.this;
                            Account account = credentialsSettingsChimeraActivity2.q;
                            atzb.s(account);
                            return dqmr.b(credentialsSettingsChimeraActivity2.m.a(account, (String) a.c(), true));
                        }
                    }, credentialsSettingsChimeraActivity.getString(R.string.credentials_pref_failed_add_never_save));
                }
            }
        }).setCancelable(true).show();
        zsh.a().c(r(505));
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.common_Theme_GoogleSettings);
        setContentView(R.layout.credentials_settings);
        String a = bonp.a();
        atzb.s(a);
        this.m = new xnd(this, new zrt(a));
        this.x = bojs.a(this);
        this.v = findViewById(R.id.no_connection_snackbar);
        Button button = (Button) findViewById(R.id.retry_connection);
        this.w = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: aayk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CredentialsSettingsChimeraActivity.this.k();
            }
        });
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.credentials_pref_storage_enabled);
        this.j = switchCompat;
        switchCompat.setOnCheckedChangeListener(this);
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R.id.credentials_pref_auto_signin);
        this.k = switchCompat2;
        switchCompat2.setOnCheckedChangeListener(this);
        this.l = (ViewGroup) findViewById(R.id.credentials_pref_never_save_list);
        View findViewById = findViewById(R.id.credentials_add_never_save_app);
        this.u = findViewById;
        findViewById.setOnClickListener(this);
        String string = getResources().getString(R.string.credentials_saved_passwords_link_prefix);
        String string2 = getResources().getString(R.string.credentials_saved_passwords_link_text);
        String str = (String) ((ekxc) atpj.k).a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new DefensiveURLSpan(str, true), length, spannableStringBuilder.length(), 33);
        if (!TextUtils.isEmpty(null)) {
            spannableStringBuilder.append((CharSequence) null);
        }
        TextView textView = (TextView) findViewById(R.id.saved_passwords_link);
        textView.setText(spannableStringBuilder);
        textView.setOnClickListener(new View.OnClickListener() { // from class: aayl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CredentialsSettingsChimeraActivity.this.o((String) ((ekxc) atpj.k).a);
                zsh.a().c(CredentialsSettingsChimeraActivity.r(507));
            }
        });
        this.o = findViewById(R.id.all_settings);
        this.n = findViewById(R.id.custom_passphrase_warning);
        k();
        Account account = (Account) ((Bundle) ekvh.c(bundle, (Bundle) ekvh.c(getIntent().getExtras(), Bundle.EMPTY))).getParcelable("EXTRA_ACCOUNT");
        ig hO = hO();
        atzb.s(hO);
        hO.q(4, 4);
        hO.o(true);
        auvu auvuVar = new auvu(hO);
        auvuVar.b(R.string.common_google_settings_credentials_title);
        auvv a2 = auvuVar.a();
        this.t = a2;
        a2.d = this;
        if (account != null) {
            a2.i(account.name);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.credentials_settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String item = this.t.getItem(i);
        atzb.s(item);
        s(new Account(item, "com.google"));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        s(null);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_help_center) {
            o(fnfq.c());
            zsh.a().c(r(508));
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("EXTRA_ACCOUNT", this.q);
        super.onSaveInstanceState(bundle);
    }

    public final void p(int i, ekww ekwwVar, String str) {
        eqgc.t(this.x.c(Integer.valueOf(i), ekwwVar), new aays(this, str), eqex.a);
    }

    public final void q() {
        final Account account = this.q;
        if (account == null) {
            return;
        }
        eqgc.t(this.x.c(1, new ekww() { // from class: aaym
            @Override // defpackage.ekww
            public final Object lK() {
                xnd xndVar = CredentialsSettingsChimeraActivity.this.m;
                atfn atfnVar = new atfn();
                atfnVar.d = 1527;
                final Account account2 = account;
                atfnVar.a = new atfd() { // from class: xms
                    @Override // defpackage.atfd
                    public final void d(Object obj, Object obj2) {
                        int i = xnd.a;
                        ((zsb) ((zrs) obj).H()).b(new xnc((dhma) obj2, AccountCredentialSettings.class), account2);
                    }
                };
                return dqmr.b(xndVar.jd(atfnVar.a()));
            }
        }), new aayr(this), eqex.a);
    }
}
