package com.google.android.gms.auth.uiflows.consent;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.common.audience.widgets.AudienceView;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import defpackage.adkf;
import defpackage.aril;
import defpackage.aris;
import defpackage.asbz;
import defpackage.ascc;
import defpackage.asej;
import defpackage.asne;
import defpackage.asnj;
import defpackage.asoe;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.qfn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthAudienceViewChimeraActivity extends qfn implements View.OnClickListener, aris {
    public static final /* synthetic */ int h = 0;
    private static final asot i = asot.b("AuthAudienceViewActivity", asej.AUTH_ACCOUNT_DATA);
    private String j;
    private String k;
    private ScopeData l;
    private Audience m;
    private Audience n;
    private AudienceView o;
    private RadioButton p;
    private RadioButton q;
    private LinearLayout r;
    private TextView s;

    private final void b() {
        AudienceView audienceView = this.o;
        if (audienceView != null && this.p != null) {
            audienceView.setEnabled(false);
            this.p.setEnabled(false);
        }
        c(true);
        Intent intent = new Intent(new Intent("com.google.android.gms.common.acl.CHOOSE_ACL").setPackage("com.google.android.gms"));
        aril.c(this.k, intent);
        aril.e(this.m.b, intent);
        intent.putParcelableArrayListExtra("INITIAL_ACL", aril.a(this.m.b));
        aril.f(intent);
        aril.d(getString(R.string.auth_plus_audience_selection_description_acl), intent);
        startActivityForResult(intent, 1);
    }

    private final void c(boolean z) {
        this.p.setChecked(z);
        this.q.setChecked(!z);
    }

    @Override // defpackage.aris
    public final void a() {
        b();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            AudienceView audienceView = this.o;
            if (audienceView != null && this.p != null) {
                audienceView.setEnabled(true);
                this.p.setEnabled(true);
            }
            if (i3 == -1) {
                Intent intent2 = new Intent(intent);
                asbz asbzVar = new asbz();
                asbzVar.b(aril.b(intent2));
                Audience a = asbzVar.a();
                this.m = a;
                AudienceView audienceView2 = this.o;
                if (audienceView2 != null) {
                    audienceView2.a(a);
                    c(!ascc.a(this.m));
                }
                i3 = -1;
            } else if (ascc.a(this.m)) {
                c(false);
            }
            i2 = 1;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        this.o.a(this.n);
        Intent intent = new Intent();
        intent.putExtra("pacl_audience", this.n);
        setResult(0, intent);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.p || view == this.o) {
            b();
            return;
        }
        if (view == this.q || view == this.r) {
            c(false);
        } else if (view == findViewById(R.id.ok)) {
            Intent intent = new Intent();
            intent.putExtra("pacl_audience", this.p.isChecked() ? this.m : new asbz().a());
            setResult(-1, intent);
            finish();
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        Audience a;
        requestWindowFeature(1);
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.n = (Audience) intent.getParcelableExtra("pacl_audience");
        this.j = intent.getStringExtra("scope_description");
        this.k = intent.getStringExtra("account_name");
        ScopeData scopeData = (ScopeData) intent.getParcelableExtra("scope_data");
        this.l = scopeData;
        if (this.n == null) {
            String str = scopeData.f;
            if (str == null) {
                a = null;
            } else {
                try {
                    List b = adkf.b(asnj.f(str));
                    asbz asbzVar = new asbz();
                    asbzVar.b(b);
                    a = asbzVar.a();
                } catch (Exception e) {
                    ((ejhf) ((ejhf) i.i()).s(e)).B("Failed to parse audience from roster: %s", str);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(AudienceMember.a("myCircles", getResources().getString(R.string.common_chips_label_your_circles)));
                    asbz asbzVar2 = new asbz();
                    asbzVar2.b(arrayList);
                    a = asbzVar2.a();
                }
            }
            this.n = a;
        }
        if (bundle == null) {
            this.m = this.n;
        } else {
            this.m = (Audience) bundle.getParcelable("STATE_SELECTED_AUDIENCE");
        }
        setContentView(R.layout.auth_consent_audience_view_activity);
        AudienceView audienceView = (AudienceView) findViewById(R.id.audience_view);
        this.o = audienceView;
        audienceView.b = this;
        try {
            audienceView.a.f();
        } catch (RemoteException unused) {
        }
        try {
            this.o.a.g();
        } catch (RemoteException unused2) {
        }
        this.p = (RadioButton) findViewById(R.id.acl_radio_button);
        this.q = (RadioButton) findViewById(R.id.private_pacl_radio_button);
        this.r = (LinearLayout) findViewById(R.id.private_pacl_layout);
        this.o.a(this.m);
        this.p.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.o.setOnClickListener(this);
        c(!ascc.a(this.m));
        ((Button) findViewById(R.id.ok)).setOnClickListener(this);
        Spanned fromHtml = Html.fromHtml(this.j);
        TextView textView = (TextView) findViewById(R.id.pacl_description);
        this.s = textView;
        textView.setText(fromHtml);
        this.s.setMovementMethod(LinkMovementMethod.getInstance());
        this.s.setClickable(true);
        asne.b(getContainerActivity(), asoe.n(getResources()) ? r6.getDimension(R.dimen.plus_auth_dialog_tablet_resize_factor) : r6.getDimension(R.dimen.plus_auth_dialog_resize_factor));
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("STATE_SELECTED_AUDIENCE", this.m);
    }
}
