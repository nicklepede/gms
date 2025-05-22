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
import defpackage.afkm;
import defpackage.atla;
import defpackage.atlh;
import defpackage.aueo;
import defpackage.auer;
import defpackage.auid;
import defpackage.auqy;
import defpackage.aurd;
import defpackage.aury;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.ryr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthAudienceViewChimeraActivity extends ryr implements View.OnClickListener, atlh {
    public static final /* synthetic */ int h = 0;
    private static final ausn i = ausn.b("AuthAudienceViewActivity", auid.AUTH_ACCOUNT_DATA);
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
        atla.c(this.k, intent);
        atla.e(this.m.b, intent);
        intent.putParcelableArrayListExtra("INITIAL_ACL", atla.a(this.m.b));
        atla.f(intent);
        atla.d(getString(R.string.auth_plus_audience_selection_description_acl), intent);
        startActivityForResult(intent, 1);
    }

    private final void c(boolean z) {
        this.p.setChecked(z);
        this.q.setChecked(!z);
    }

    @Override // defpackage.atlh
    public final void a() {
        b();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            AudienceView audienceView = this.o;
            if (audienceView != null && this.p != null) {
                audienceView.setEnabled(true);
                this.p.setEnabled(true);
            }
            if (i3 == -1) {
                Intent intent2 = new Intent(intent);
                aueo aueoVar = new aueo();
                aueoVar.b(atla.b(intent2));
                Audience a = aueoVar.a();
                this.m = a;
                AudienceView audienceView2 = this.o;
                if (audienceView2 != null) {
                    audienceView2.a(a);
                    c(!auer.a(this.m));
                }
                i3 = -1;
            } else if (auer.a(this.m)) {
                c(false);
            }
            i2 = 1;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
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
            intent.putExtra("pacl_audience", this.p.isChecked() ? this.m : new aueo().a());
            setResult(-1, intent);
            finish();
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
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
                    List b = afkm.b(aurd.f(str));
                    aueo aueoVar = new aueo();
                    aueoVar.b(b);
                    a = aueoVar.a();
                } catch (Exception e) {
                    ((eluo) ((eluo) i.i()).s(e)).B("Failed to parse audience from roster: %s", str);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(AudienceMember.a("myCircles", getResources().getString(R.string.common_chips_label_your_circles)));
                    aueo aueoVar2 = new aueo();
                    aueoVar2.b(arrayList);
                    a = aueoVar2.a();
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
        c(!auer.a(this.m));
        ((Button) findViewById(R.id.ok)).setOnClickListener(this);
        Spanned fromHtml = Html.fromHtml(this.j);
        TextView textView = (TextView) findViewById(R.id.pacl_description);
        this.s = textView;
        textView.setText(fromHtml);
        this.s.setMovementMethod(LinkMovementMethod.getInstance());
        this.s.setClickable(true);
        auqy.b(getContainerActivity(), aury.n(getResources()) ? r6.getDimension(R.dimen.plus_auth_dialog_tablet_resize_factor) : r6.getDimension(R.dimen.plus_auth_dialog_resize_factor));
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("STATE_SELECTED_AUDIENCE", this.m);
    }
}
