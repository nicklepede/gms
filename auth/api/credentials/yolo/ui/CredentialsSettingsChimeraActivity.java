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
import defpackage.anxy;
import defpackage.aojj;
import defpackage.armu;
import defpackage.arwm;
import defpackage.asew;
import defpackage.asnb;
import defpackage.asot;
import defpackage.aspy;
import defpackage.assa;
import defpackage.assb;
import defpackage.assx;
import defpackage.bmda;
import defpackage.bmgx;
import defpackage.eihn;
import defpackage.eiho;
import defpackage.eiic;
import defpackage.eiih;
import defpackage.eijr;
import defpackage.eijx;
import defpackage.eitj;
import defpackage.eivv;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.ejzo;
import defpackage.enre;
import defpackage.ensj;
import defpackage.fecj;
import defpackage.fkox;
import defpackage.ig;
import defpackage.irx;
import defpackage.qet;
import defpackage.vrc;
import defpackage.wlt;
import defpackage.xtw;
import defpackage.xuk;
import defpackage.xul;
import defpackage.yzb;
import defpackage.yzc;
import defpackage.yzd;
import java.util.List;
import java.util.TreeSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CredentialsSettingsChimeraActivity extends qet implements CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener, View.OnClickListener {
    public static final /* synthetic */ int r = 0;
    private static final asot s = xul.a("CredentialsSettingsChimeraActivity");
    public SwitchCompat j;
    public SwitchCompat k;
    public ViewGroup l;
    public vrc m;
    public View n;
    public View o;
    public AccountCredentialSettings p;
    public Account q;
    private assb t;
    private View u;
    private View v;
    private TextView w;
    private bmda x;
    private asnb y;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class SettingsIntentOperation extends anxy {
        @Override // defpackage.anxy
        public final GoogleSettingsItem b() {
            if (!((Boolean) wlt.a.b()).booleanValue()) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.settings.CREDENTIALS_SETTINGS"), 4, R.string.common_google_settings_credentials_title, aojj.CREDENTIALS_ITEM, asew.DEFAULT_AUTH_CREDENTIALS_BASE);
            googleSettingsItem.e = true;
            return googleSettingsItem;
        }
    }

    public static ejzo r(int i) {
        fecj v = ejzo.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ejzo ejzoVar = (ejzo) v.b;
        ejzoVar.c = i - 1;
        ejzoVar.b |= 1;
        return (ejzo) v.Q();
    }

    private final void s(Account account) {
        if (eihn.a(account, this.q)) {
            return;
        }
        this.q = account;
        m(true);
        q();
    }

    public final irx a(String str) {
        try {
            return assx.b(this).g(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new irx(str, null);
        }
    }

    public final void k() {
        boolean b = aspy.b(this);
        this.v.setVisibility(true != b ? 0 : 8);
        n(b);
    }

    public final void l(View view, String str) {
        irx a = a(str);
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
            asnb asnbVar = new asnb(this, imageView);
            this.y = asnbVar;
            asnbVar.setAlpha(255);
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
            ((ejhf) s.i()).x("Unable to find the browser.");
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
                p(2, new eijr() { // from class: yyp
                    @Override // defpackage.eijr
                    public final Object a() {
                        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = CredentialsSettingsChimeraActivity.this;
                        final Account account = credentialsSettingsChimeraActivity.q;
                        arwm.s(account);
                        vrc vrcVar = credentialsSettingsChimeraActivity.m;
                        arcy arcyVar = new arcy();
                        arcyVar.d = 1529;
                        final boolean z2 = z;
                        arcyVar.a = new arco() { // from class: vqu
                            @Override // defpackage.arco
                            public final void d(Object obj, Object obj2) {
                                int i = vrc.a;
                                ((xue) ((xtv) obj).H()).p(new vqz((dfau) obj2), account, z2);
                            }
                        };
                        return doci.b(vrcVar.iT(arcyVar.a()));
                    }
                }, getString(R.string.credentials_pref_failed_save_storage_enabled));
                xuk.a().c(r(true != z ? 501 : 502));
                return;
            }
            return;
        }
        if (compoundButton.getId() != this.k.getId() || this.p.b == z) {
            return;
        }
        p(3, new eijr() { // from class: yyq
            @Override // defpackage.eijr
            public final Object a() {
                CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = CredentialsSettingsChimeraActivity.this;
                final Account account = credentialsSettingsChimeraActivity.q;
                arwm.s(account);
                vrc vrcVar = credentialsSettingsChimeraActivity.m;
                arcy arcyVar = new arcy();
                arcyVar.d = 1530;
                final boolean z2 = z;
                arcyVar.a = new arco() { // from class: vqw
                    @Override // defpackage.arco
                    public final void d(Object obj, Object obj2) {
                        int i = vrc.a;
                        ((xue) ((xtv) obj).H()).m(new vqz((dfau) obj2), account, z2);
                    }
                };
                return doci.b(vrcVar.iT(arcyVar.a()));
            }
        }, getString(R.string.credentials_pref_failed_save_auto_signin));
        xuk.a().c(r(true != z ? 503 : 504));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        final eitj i;
        View view2 = this.u;
        if (view2 == null || view == null || view2.getId() != view.getId()) {
            return;
        }
        List<ApplicationInfo> installedApplications = getPackageManager().getInstalledApplications(128);
        if (installedApplications == null) {
            ((ejhf) s.i()).x("Unable to get any apps.");
            int i2 = eitj.d;
            i = ejcb.a;
        } else {
            Iterable j = eivv.j(eivv.d(installedApplications, new eiih() { // from class: yyx
                @Override // defpackage.eiih
                public final boolean a(Object obj) {
                    int i3 = CredentialsSettingsChimeraActivity.r;
                    return (((ApplicationInfo) obj).flags & 1) == 0;
                }
            }), new eiho() { // from class: yyn
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    int i3 = CredentialsSettingsChimeraActivity.r;
                    return ((ApplicationInfo) obj).packageName;
                }
            });
            TreeSet treeSet = new TreeSet();
            eivv.t(treeSet, j);
            treeSet.removeAll(this.p.c);
            i = eitj.i(treeSet);
        }
        new AlertDialog.Builder(this).setTitle(getResources().getString(R.string.credentials_add_never_save_app_dialog_title)).setAdapter(new yzd(this, this, i), new DialogInterface.OnClickListener() { // from class: yyt
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                String str = (String) i.get(i3);
                final CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = CredentialsSettingsChimeraActivity.this;
                final eiid a = aozv.a(credentialsSettingsChimeraActivity, str);
                if (a.h()) {
                    credentialsSettingsChimeraActivity.p(4, new eijr() { // from class: yyr
                        @Override // defpackage.eijr
                        public final Object a() {
                            CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity2 = CredentialsSettingsChimeraActivity.this;
                            Account account = credentialsSettingsChimeraActivity2.q;
                            arwm.s(account);
                            return doci.b(credentialsSettingsChimeraActivity2.m.a(account, (String) a.c(), true));
                        }
                    }, credentialsSettingsChimeraActivity.getString(R.string.credentials_pref_failed_add_never_save));
                }
            }
        }).setCancelable(true).show();
        xuk.a().c(r(505));
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.common_Theme_GoogleSettings);
        setContentView(R.layout.credentials_settings);
        String a = bmgx.a();
        arwm.s(a);
        this.m = new vrc(this, new xtw(a));
        this.x = bmda.a(this);
        this.v = findViewById(R.id.no_connection_snackbar);
        Button button = (Button) findViewById(R.id.retry_connection);
        this.w = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: yyu
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
        String str = (String) ((eijx) armu.k).a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new DefensiveURLSpan(str, true), length, spannableStringBuilder.length(), 33);
        if (!TextUtils.isEmpty(null)) {
            spannableStringBuilder.append((CharSequence) null);
        }
        TextView textView = (TextView) findViewById(R.id.saved_passwords_link);
        textView.setText(spannableStringBuilder);
        textView.setOnClickListener(new View.OnClickListener() { // from class: yyv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CredentialsSettingsChimeraActivity.this.o((String) ((eijx) armu.k).a);
                xuk.a().c(CredentialsSettingsChimeraActivity.r(507));
            }
        });
        this.o = findViewById(R.id.all_settings);
        this.n = findViewById(R.id.custom_passphrase_warning);
        k();
        Account account = (Account) ((Bundle) eiic.c(bundle, (Bundle) eiic.c(getIntent().getExtras(), Bundle.EMPTY))).getParcelable("EXTRA_ACCOUNT");
        ig hy = hy();
        arwm.s(hy);
        hy.q(4, 4);
        hy.o(true);
        assa assaVar = new assa(hy);
        assaVar.b(R.string.common_google_settings_credentials_title);
        assb a2 = assaVar.a();
        this.t = a2;
        a2.d = this;
        if (account != null) {
            a2.i(account.name);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.credentials_settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String item = this.t.getItem(i);
        arwm.s(item);
        s(new Account(item, "com.google"));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        s(null);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_help_center) {
            o(fkox.c());
            xuk.a().c(r(508));
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("EXTRA_ACCOUNT", this.q);
        super.onSaveInstanceState(bundle);
    }

    public final void p(int i, eijr eijrVar, String str) {
        ensj.t(this.x.c(Integer.valueOf(i), eijrVar), new yzc(this, str), enre.a);
    }

    public final void q() {
        final Account account = this.q;
        if (account == null) {
            return;
        }
        ensj.t(this.x.c(1, new eijr() { // from class: yyw
            @Override // defpackage.eijr
            public final Object a() {
                vrc vrcVar = CredentialsSettingsChimeraActivity.this.m;
                arcy arcyVar = new arcy();
                arcyVar.d = 1527;
                final Account account2 = account;
                arcyVar.a = new arco() { // from class: vqr
                    @Override // defpackage.arco
                    public final void d(Object obj, Object obj2) {
                        int i = vrc.a;
                        ((xue) ((xtv) obj).H()).b(new vrb((dfau) obj2, AccountCredentialSettings.class), account2);
                    }
                };
                return doci.b(vrcVar.iO(arcyVar.a()));
            }
        }), new yzb(this), enre.a);
    }
}
