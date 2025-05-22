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
import defpackage.arvi;
import defpackage.arvr;
import defpackage.asyd;
import defpackage.asyx;
import defpackage.aszb;
import defpackage.aszc;
import defpackage.aszd;
import defpackage.auad;
import defpackage.aura;
import defpackage.boim;
import defpackage.boio;
import defpackage.bonr;
import defpackage.boof;
import defpackage.boog;
import defpackage.btzg;
import defpackage.dvww;
import defpackage.ektg;
import defpackage.ekti;
import defpackage.ekvi;
import defpackage.emkt;
import defpackage.emlk;
import defpackage.emll;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fuvr;
import defpackage.fuvu;
import defpackage.fuwn;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AccountPickerChimeraActivity extends rxx {
    public static final auad j = new auad("CommonAccount", "AccountPicker");
    private arvr A;
    public String k;
    public aszb l;
    public String m;
    public Account n;
    public dvww o;
    public TextView p;
    public TextView q;
    public ImageView r;
    public View s;
    public aszc t;
    public boio u;
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
            imageView.setOnClickListener(new View.OnClickListener() { // from class: asxy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountPickerChimeraActivity.this.finish();
                }
            });
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new asyd(this, recyclerView));
        int i = this.t.i;
        if (i != 2132148938 && i != 2132148932 && i != 2132148935) {
            getWindow().setBackgroundDrawableResource(R.drawable.common_account_rounded_dialog_background);
        }
        this.u.f();
    }

    private final void p(ekvi ekviVar, ekvi ekviVar2) {
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        if (!l() || !this.x) {
            findViewById(R.id.consent_divider).setVisibility(0);
            this.y.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(getString(R.string.common_account_consent_text_permissions, new Object[]{this.k}));
            if (ekviVar.h() || ekviVar2.h()) {
                this.y.setMovementMethod(new LinkMovementMethod());
                String lowerCase = getString(R.string.common_privacy_policy).toLowerCase();
                String lowerCase2 = getString(R.string.common_terms_of_service).toLowerCase();
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                if (ekviVar.h()) {
                    boog.d(this, spannableStringBuilder4, lowerCase, n((String) ekviVar.c()), getTheme(), getThemeResId(), R.attr.common_account_link_color);
                    spannableStringBuilder = spannableStringBuilder4;
                } else {
                    spannableStringBuilder = spannableStringBuilder4;
                    spannableStringBuilder.append((CharSequence) lowerCase);
                }
                if (ekviVar2.h()) {
                    spannableStringBuilder2 = spannableStringBuilder5;
                    boog.d(this, spannableStringBuilder2, lowerCase2, n((String) ekviVar2.c()), getTheme(), getThemeResId(), R.attr.common_account_link_color);
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
        boog.d(this, spannableStringBuilder6, string, n((String) ekviVar.c()), getTheme(), getThemeResId(), R.attr.common_account_consent_color);
        boog.d(this, spannableStringBuilder7, string2, n((String) ekviVar2.c()), getTheme(), getThemeResId(), R.attr.common_account_consent_color);
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
        ekvi ekviVar;
        ImageView imageView = this.r;
        if (imageView != null) {
            Application application = getApplication();
            String str = this.m;
            auad auadVar = aszd.a;
            try {
                ekviVar = ekvi.j(application.getPackageManager().getApplicationIcon(str));
            } catch (PackageManager.NameNotFoundException e) {
                aszd.a.m("Cannot find icon of package: %s", str, e);
                ekviVar = ektg.a;
            }
            Drawable drawable = (Drawable) ekviVar.f();
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
        boio boioVar = this.u;
        int i2 = 0;
        if (boioVar != null && boioVar.d.ii() != null) {
            i2 = ((List) this.u.d.ii()).size();
        }
        fgrc v = emkt.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        emkt emktVar = (emkt) fgriVar;
        emktVar.c = i - 1;
        emktVar.b |= 1;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        emkt emktVar2 = (emkt) fgriVar2;
        emktVar2.b |= 2;
        emktVar2.d = i2;
        int i3 = this.v;
        if (!fgriVar2.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        emkt emktVar3 = (emkt) fgriVar3;
        emktVar3.b |= 4;
        emktVar3.e = i3;
        if (!fgriVar3.L()) {
            v.U();
        }
        fgri fgriVar4 = v.b;
        emkt emktVar4 = (emkt) fgriVar4;
        emktVar4.g = 1;
        emktVar4.b |= 16;
        String str = this.m;
        if (str != null) {
            if (!fgriVar4.L()) {
                v.U();
            }
            emkt emktVar5 = (emkt) v.b;
            emktVar5.b |= 8;
            emktVar5.f = str;
        }
        fgrc v2 = emll.a.v();
        emlk emlkVar = emlk.ACCOUNT_PICKER_EVENT;
        if (!v2.b.L()) {
            v2.U();
        }
        emll emllVar = (emll) v2.b;
        emllVar.e = emlkVar.ar;
        emllVar.b |= 1;
        emkt emktVar6 = (emkt) v.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        emll emllVar2 = (emll) v2.b;
        emktVar6.getClass();
        emllVar2.t = emktVar6;
        emllVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        emll emllVar3 = (emll) v2.Q();
        if (fuvu.a.lK().a()) {
            btzg.v().f(emllVar3);
        } else {
            this.A.i(emllVar3).d();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.u.e(i, i2, intent);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        m(2);
        super.onBackPressed();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        Intent intent2 = getIntent();
        String str = null;
        if (intent2 != null) {
            intent = aszd.a(intent2, this, true);
            if (intent != null) {
                aszc aszcVar = new aszc(intent, 1);
                this.t = aszcVar;
                setTheme(aszcVar.i);
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
        List list = arvr.n;
        this.A = new arvi(applicationContext, "ANDROID_AUTH").a();
        aszc aszcVar2 = this.t;
        String q = aura.q(this);
        if (q == null) {
            j.m("Unable to get caller identity", new Object[0]);
        } else if (bonr.a(this, q)) {
            str = ekti.e(q, getPackageName()) ? aszcVar2.h : q;
        } else {
            j.m("App was not signed by Google.", new Object[0]);
        }
        if (str == null) {
            this.w = false;
            finish();
            return;
        }
        this.m = str;
        this.k = aszd.b(getApplication(), this.m);
        if (this.u == null) {
            boim boimVar = new boim(getApplicationContext(), this.m, fuwn.d());
            aszc aszcVar3 = this.t;
            boimVar.g = aszcVar3.d;
            boimVar.d(aszcVar3.a);
            aszc aszcVar4 = this.t;
            boimVar.b = aszcVar4.b;
            boimVar.f = aszcVar4.m;
            boimVar.a = true;
            boimVar.e = aszcVar4.l;
            getApplicationContext();
            boimVar.h = this.t.n;
            this.u = (boio) new jxw(this, boimVar).a(boio.class);
        }
        boio boioVar = this.u;
        this.x = boioVar.h;
        boioVar.e.g(this, new jvs() { // from class: asxz
            @Override // defpackage.jvs
            public final void a(Object obj) {
                Bundle extras;
                final String string;
                boin boinVar = (boin) obj;
                if (boinVar == null) {
                    return;
                }
                AccountPickerChimeraActivity accountPickerChimeraActivity = AccountPickerChimeraActivity.this;
                int i = boinVar.a;
                Intent intent3 = boinVar.b;
                if (i == 10) {
                    Toast.makeText(accountPickerChimeraActivity, R.string.common_account_restricted_no_accounts, 0).show();
                    accountPickerChimeraActivity.m(2);
                    i = 0;
                } else {
                    if (i == -1 && intent3 != null && intent3.getExtras() != null && (extras = intent3.getExtras()) != null && (string = extras.getString("authAccount")) != null) {
                        List list2 = (List) accountPickerChimeraActivity.u.d.ii();
                        accountPickerChimeraActivity.v = list2 != null ? elja.a(list2, new ekvm() { // from class: asyb
                            @Override // defpackage.ekvm
                            public final boolean a(Object obj2) {
                                auad auadVar = AccountPickerChimeraActivity.j;
                                return string.equals(((boif) obj2).c);
                            }
                        }) : -1;
                        accountPickerChimeraActivity.m(3);
                        if (accountPickerChimeraActivity.t.c) {
                            atxi.d(accountPickerChimeraActivity, string, accountPickerChimeraActivity.m);
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
        this.u.f.g(this, new jvs() { // from class: asya
            @Override // defpackage.jvs
            public final void a(Object obj) {
                Intent intent3;
                boin boinVar = (boin) obj;
                if (boinVar == null) {
                    return;
                }
                AccountPickerChimeraActivity accountPickerChimeraActivity = AccountPickerChimeraActivity.this;
                int i = boinVar.a;
                if (i == 1) {
                    intent3 = AccountTypePickerChimeraActivity.a(accountPickerChimeraActivity, accountPickerChimeraActivity.t);
                } else if (i == 2) {
                    accountPickerChimeraActivity.m(4);
                    intent3 = boinVar.b;
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

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        if (isFinishing() && this.w) {
            m(2);
        }
        super.onDestroy();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
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
                asyx asyxVar = new asyx();
                asyxVar.b();
                asyxVar.c();
                asyxVar.c = this.u;
                aszb a = asyxVar.a();
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
                recyclerView.x(new boof(this, getDrawable(R.drawable.common_account_list_divider), this.p == null ? 1 : 0, dimensionPixelSize, dimensionPixelSize));
                ekvi ekviVar = this.t.k;
                if (ekviVar.h() && (textView = this.p) != null) {
                    textView.setText((CharSequence) ekviVar.c());
                }
                aszc aszcVar = this.t;
                if (aszcVar.j) {
                    p(aszcVar.b(), this.t.c());
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
            asyx asyxVar2 = new asyx();
            asyxVar2.b();
            asyxVar2.c();
            asyxVar2.c = this.u;
            asyxVar2.a = R.layout.common_account_manage_accounts_chip_view;
            asyxVar2.b = R.layout.common_account_selected_account;
            aszb a2 = asyxVar2.a();
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
                if (!fuwn.e()) {
                    Account account = this.n;
                    textView2.setText(account != null ? account.name : null);
                }
            }
            if (this.x) {
                fuvr fuvrVar = fuvr.a;
                p(ekvi.j(fuvrVar.lK().a()), ekvi.j(fuvrVar.lK().b()));
            } else {
                p(this.t.b(), this.t.c());
            }
            o(recyclerView2);
        }
    }
}
