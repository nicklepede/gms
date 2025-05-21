package com.google.android.gms.common.account;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;
import com.google.android.gms.common.account.AccountTypePickerChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.apsr;
import defpackage.apta;
import defpackage.aqvo;
import defpackage.aqwi;
import defpackage.aqwm;
import defpackage.aqwn;
import defpackage.aqwo;
import defpackage.arxo;
import defpackage.asng;
import defpackage.bmbu;
import defpackage.bmbw;
import defpackage.bmgz;
import defpackage.bmhn;
import defpackage.bmho;
import defpackage.brrl;
import defpackage.dtmk;
import defpackage.eigb;
import defpackage.eigd;
import defpackage.eiid;
import defpackage.ejxi;
import defpackage.ejxz;
import defpackage.ejya;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fsav;
import defpackage.fsay;
import defpackage.fsbr;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AccountPickerChimeraActivity extends qet {
    public static final arxo j = new arxo("CommonAccount", "AccountPicker");
    private apta A;
    public String k;
    public aqwm l;
    public String m;
    public Account n;
    public dtmk o;
    public TextView p;
    public TextView q;
    public ImageView r;
    public View s;
    public aqwn t;
    public bmbw u;
    public int v = -1;
    public boolean w = true;
    public boolean x;
    private TextView y;
    private TextView z;

    private static String n(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str)).toUri(1);
    }

    private final void o(RecyclerView recyclerView) {
        a();
        k();
        ImageView imageView = (ImageView) findViewById(R.id.close_button);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: aqvj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountPickerChimeraActivity.this.finish();
                }
            });
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new aqvo(this, recyclerView));
        int i = this.t.i;
        if (i != 2132148934 && i != 2132148928 && i != 2132148931) {
            getWindow().setBackgroundDrawableResource(R.drawable.common_account_rounded_dialog_background);
        }
        this.u.f();
    }

    private final void p(eiid eiidVar, eiid eiidVar2) {
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        if (!l() || !this.x) {
            findViewById(R.id.consent_divider).setVisibility(0);
            this.y.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(getString(R.string.common_account_consent_text_permissions, new Object[]{this.k}));
            if (eiidVar.h() || eiidVar2.h()) {
                this.y.setMovementMethod(new LinkMovementMethod());
                String lowerCase = getString(R.string.common_privacy_policy).toLowerCase();
                String lowerCase2 = getString(R.string.common_terms_of_service).toLowerCase();
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                if (eiidVar.h()) {
                    bmho.d(this, spannableStringBuilder4, lowerCase, n((String) eiidVar.c()), getTheme(), getThemeResId(), R.attr.common_account_link_color);
                    spannableStringBuilder = spannableStringBuilder4;
                } else {
                    spannableStringBuilder = spannableStringBuilder4;
                    spannableStringBuilder.append((CharSequence) lowerCase);
                }
                if (eiidVar2.h()) {
                    spannableStringBuilder2 = spannableStringBuilder5;
                    bmho.d(this, spannableStringBuilder2, lowerCase2, n((String) eiidVar2.c()), getTheme(), getThemeResId(), R.attr.common_account_link_color);
                } else {
                    spannableStringBuilder2 = spannableStringBuilder5;
                    spannableStringBuilder2.append((CharSequence) lowerCase2);
                }
                spannableStringBuilder3.append((CharSequence) " ");
                spannableStringBuilder3.append(TextUtils.expandTemplate(getString(R.string.common_account_consent_text_agreement), spannableStringBuilder, spannableStringBuilder2));
            }
            this.y.setText(spannableStringBuilder3);
            return;
        }
        View findViewById = findViewById(R.id.consent_divider);
        findViewById.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        findViewById.setLayoutParams(layoutParams);
        String string = getString(R.string.common_privacy_policy_composed_string);
        String string2 = getString(R.string.common_terms_of_service_composed_string);
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
        TextView textView = this.z;
        if (textView != null) {
            textView.setVisibility(0);
            this.z.setMovementMethod(new LinkMovementMethod());
        }
        bmho.d(this, spannableStringBuilder6, string, n((String) eiidVar.c()), getTheme(), getThemeResId(), R.attr.common_account_consent_color);
        bmho.d(this, spannableStringBuilder7, string2, n((String) eiidVar2.c()), getTheme(), getThemeResId(), R.attr.common_account_consent_color);
        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
        spannableStringBuilder8.append((CharSequence) spannableStringBuilder6);
        spannableStringBuilder8.append((CharSequence) "  •  ");
        spannableStringBuilder8.append((CharSequence) spannableStringBuilder7);
        TextView textView2 = this.z;
        if (textView2 != null) {
            textView2.setText(spannableStringBuilder8);
        }
    }

    public final void a() {
        eiid eiidVar;
        ImageView imageView = this.r;
        if (imageView != null) {
            Application application = getApplication();
            String str = this.m;
            arxo arxoVar = aqwo.a;
            try {
                eiidVar = eiid.j(application.getPackageManager().getApplicationIcon(str));
            } catch (PackageManager.NameNotFoundException e) {
                aqwo.a.m("Cannot find icon of package: %s", str, e);
                eiidVar = eigb.a;
            }
            Drawable drawable = (Drawable) eiidVar.f();
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            }
        }
    }

    public final void k() {
        TextView textView = this.q;
        if (textView != null) {
            String string = getString(R.string.common_account_account_chip_subtitle, new Object[]{this.k});
            if (TextUtils.isEmpty(string)) {
                textView.setVisibility(8);
            } else {
                textView.setText(string);
                textView.setVisibility(0);
            }
        }
    }

    public final boolean l() {
        return this.t.a() == R.layout.common_account_account_picker_first_party_aligned_with_one_google;
    }

    public final void m(int i) {
        bmbw bmbwVar = this.u;
        int i2 = 0;
        if (bmbwVar != null && bmbwVar.d.hT() != null) {
            i2 = ((List) this.u.d.hT()).size();
        }
        fecj v = ejxi.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ejxi ejxiVar = (ejxi) fecpVar;
        ejxiVar.c = i - 1;
        ejxiVar.b |= 1;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        ejxi ejxiVar2 = (ejxi) fecpVar2;
        ejxiVar2.b |= 2;
        ejxiVar2.d = i2;
        int i3 = this.v;
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        ejxi ejxiVar3 = (ejxi) fecpVar3;
        ejxiVar3.b |= 4;
        ejxiVar3.e = i3;
        if (!fecpVar3.L()) {
            v.U();
        }
        fecp fecpVar4 = v.b;
        ejxi ejxiVar4 = (ejxi) fecpVar4;
        ejxiVar4.g = 1;
        ejxiVar4.b |= 16;
        String str = this.m;
        if (str != null) {
            if (!fecpVar4.L()) {
                v.U();
            }
            ejxi ejxiVar5 = (ejxi) v.b;
            ejxiVar5.b |= 8;
            ejxiVar5.f = str;
        }
        fecj v2 = ejya.a.v();
        ejxz ejxzVar = ejxz.ACCOUNT_PICKER_EVENT;
        if (!v2.b.L()) {
            v2.U();
        }
        ejya ejyaVar = (ejya) v2.b;
        ejyaVar.e = ejxzVar.aw;
        ejyaVar.b |= 1;
        ejxi ejxiVar6 = (ejxi) v.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        ejya ejyaVar2 = (ejya) v2.b;
        ejxiVar6.getClass();
        ejyaVar2.t = ejxiVar6;
        ejyaVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        ejya ejyaVar3 = (ejya) v2.Q();
        if (fsay.a.a().a()) {
            brrl.v().f(ejyaVar3);
        } else {
            this.A.i(ejyaVar3).d();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.u.e(i, i2, intent);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        m(2);
        super.onBackPressed();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        Intent intent2 = getIntent();
        String str = null;
        if (intent2 != null) {
            intent = aqwo.a(intent2, this, true);
            if (intent != null) {
                aqwn aqwnVar = new aqwn(intent, 1);
                this.t = aqwnVar;
                setTheme(aqwnVar.i);
                this.n = this.t.e;
            }
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (intent2 == null) {
            j.f("This activity cannot be called without an intent, finishing early", new Object[0]);
            finish();
            return;
        }
        if (intent == null) {
            j.f("Caller package name could not be determined, finishing early", new Object[0]);
            finish();
            return;
        }
        setTitle((CharSequence) null);
        Context applicationContext = getApplicationContext();
        List list = apta.n;
        this.A = new apsr(applicationContext, "ANDROID_AUTH").a();
        aqwn aqwnVar2 = this.t;
        String q = asng.q(this);
        if (q == null) {
            j.m("Unable to get caller identity", new Object[0]);
        } else if (bmgz.a(this, q)) {
            str = eigd.e(q, getPackageName()) ? aqwnVar2.h : q;
        } else {
            j.m("App was not signed by Google.", new Object[0]);
        }
        if (str == null) {
            this.w = false;
            finish();
            return;
        }
        this.m = str;
        this.k = aqwo.b(getApplication(), this.m);
        if (this.u == null) {
            bmbu bmbuVar = new bmbu(getApplicationContext(), this.m, fsbr.d());
            aqwn aqwnVar3 = this.t;
            bmbuVar.g = aqwnVar3.d;
            bmbuVar.d(aqwnVar3.a);
            aqwn aqwnVar4 = this.t;
            bmbuVar.b = aqwnVar4.b;
            bmbuVar.f = aqwnVar4.m;
            bmbuVar.a = true;
            bmbuVar.e = aqwnVar4.l;
            getApplicationContext();
            bmbuVar.h = this.t.n;
            this.u = (bmbw) new jrh(this, bmbuVar).a(bmbw.class);
        }
        bmbw bmbwVar = this.u;
        this.x = bmbwVar.h;
        bmbwVar.e.g(this, new jpd() { // from class: aqvk
            @Override // defpackage.jpd
            public final void a(Object obj) {
                Bundle extras;
                final String string;
                bmbv bmbvVar = (bmbv) obj;
                if (bmbvVar == null) {
                    return;
                }
                AccountPickerChimeraActivity accountPickerChimeraActivity = AccountPickerChimeraActivity.this;
                int i = bmbvVar.a;
                Intent intent3 = bmbvVar.b;
                if (i == 10) {
                    Toast.makeText(accountPickerChimeraActivity, R.string.common_account_restricted_no_accounts, 0).show();
                    accountPickerChimeraActivity.m(2);
                    i = 0;
                } else {
                    if (i == -1 && intent3 != null && intent3.getExtras() != null && (extras = intent3.getExtras()) != null && (string = extras.getString("authAccount")) != null) {
                        List list2 = (List) accountPickerChimeraActivity.u.d.hT();
                        accountPickerChimeraActivity.v = list2 != null ? eivv.a(list2, new eiih() { // from class: aqvm
                            @Override // defpackage.eiih
                            public final boolean a(Object obj2) {
                                arxo arxoVar = AccountPickerChimeraActivity.j;
                                return string.equals(((bmbn) obj2).c);
                            }
                        }) : -1;
                        accountPickerChimeraActivity.m(3);
                        if (accountPickerChimeraActivity.t.c) {
                            arut.d(accountPickerChimeraActivity, string, accountPickerChimeraActivity.m);
                        }
                    }
                }
                if (intent3 == null) {
                    accountPickerChimeraActivity.setResult(i);
                } else {
                    accountPickerChimeraActivity.setResult(i, intent3);
                }
                accountPickerChimeraActivity.w = false;
                accountPickerChimeraActivity.finish();
            }
        });
        this.u.f.g(this, new jpd() { // from class: aqvl
            @Override // defpackage.jpd
            public final void a(Object obj) {
                Intent intent3;
                bmbv bmbvVar = (bmbv) obj;
                if (bmbvVar == null) {
                    return;
                }
                AccountPickerChimeraActivity accountPickerChimeraActivity = AccountPickerChimeraActivity.this;
                int i = bmbvVar.a;
                if (i == 1) {
                    intent3 = AccountTypePickerChimeraActivity.a(accountPickerChimeraActivity, accountPickerChimeraActivity.t);
                } else if (i == 2) {
                    accountPickerChimeraActivity.m(4);
                    intent3 = bmbvVar.b;
                } else {
                    if (i == 3) {
                        accountPickerChimeraActivity.m(1);
                        accountPickerChimeraActivity.startActivityForResult(new Intent("android.settings.SYNC_SETTINGS").setPackage("com.android.settings"), 3);
                        accountPickerChimeraActivity.onBackPressed();
                        return;
                    }
                    intent3 = null;
                }
                if (intent3 != null) {
                    accountPickerChimeraActivity.startActivityForResult(intent3, i);
                }
            }
        });
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        if (isFinishing() && this.w) {
            m(2);
        }
        super.onDestroy();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        TextView textView;
        super.onResume();
        if (this.u.g()) {
            setContentView(this.t.a());
            View findViewById = findViewById(R.id.account_picker_container);
            if (findViewById != null) {
                findViewById.setFilterTouchesWhenObscured(true);
            }
            if (!l()) {
                this.p = (TextView) findViewById(R.id.main_title);
                this.q = (TextView) findViewById(R.id.subtitle);
                this.r = (ImageView) findViewById(R.id.app_icon);
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
                this.y = (TextView) findViewById(R.id.consent_text);
                aqwi aqwiVar = new aqwi();
                aqwiVar.b();
                aqwiVar.c();
                aqwiVar.c = this.u;
                aqwm a = aqwiVar.a();
                this.l = a;
                recyclerView.ah(a);
                recyclerView.aA();
                recyclerView.aj(new LinearLayoutManager());
                Resources resources = getResources();
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = getTheme();
                int i = R.dimen.common_account_row_item_horizontal_padding;
                if (theme != null && theme.resolveAttribute(R.attr.common_account_row_item_horizontal_padding, typedValue, true)) {
                    i = typedValue.resourceId;
                }
                int dimensionPixelSize = resources.getDimensionPixelSize(i);
                recyclerView.x(new bmhn(this, getDrawable(R.drawable.common_account_list_divider), this.p == null ? 1 : 0, dimensionPixelSize, dimensionPixelSize));
                eiid eiidVar = this.t.k;
                if (eiidVar.h() && (textView = this.p) != null) {
                    textView.setText((CharSequence) eiidVar.c());
                }
                aqwn aqwnVar = this.t;
                if (aqwnVar.j) {
                    p(aqwnVar.b(), this.t.c());
                }
                o(recyclerView);
                return;
            }
            this.p = (TextView) findViewById(R.id.main_title);
            this.s = findViewById(R.id.selected_account_container);
            TextView textView2 = (TextView) findViewById(R.id.selected_account_email);
            this.q = (TextView) findViewById(R.id.subtitle);
            this.r = (ImageView) findViewById(R.id.app_icon);
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.list);
            this.y = (TextView) findViewById(R.id.consent_text);
            this.z = (TextView) findViewById(R.id.consent_text1p);
            aqwi aqwiVar2 = new aqwi();
            aqwiVar2.b();
            aqwiVar2.c();
            aqwiVar2.c = this.u;
            aqwiVar2.a = R.layout.common_account_manage_accounts_chip_view;
            aqwiVar2.b = R.layout.common_account_selected_account;
            aqwm a2 = aqwiVar2.a();
            this.l = a2;
            recyclerView2.ah(a2);
            recyclerView2.aA();
            recyclerView2.aj(new LinearLayoutManager());
            TextView textView3 = this.p;
            if (textView3 != null && this.x && this.n == null) {
                textView3.setVisibility(0);
            }
            if (!this.t.f) {
                this.n = null;
            }
            if (this.s != null && this.n != null && textView2 != null && this.x) {
                findViewById(R.id.selected_account_container).setVisibility(0);
                if (!fsbr.e()) {
                    Account account = this.n;
                    textView2.setText(account != null ? account.name : null);
                }
            }
            if (this.x) {
                p(eiid.j(fsav.a.a().a()), eiid.j(fsav.a.a().b()));
            } else {
                p(this.t.b(), this.t.c());
            }
            o(recyclerView2);
        }
    }
}
