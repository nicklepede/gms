package com.google.android.gms.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bcja;
import defpackage.bcku;
import defpackage.bckv;
import defpackage.bcol;
import defpackage.bcpv;
import defpackage.bcpw;
import defpackage.bcsh;
import defpackage.bctz;
import defpackage.bcua;
import defpackage.bcuf;
import defpackage.bcug;
import defpackage.blah;
import defpackage.bp;
import defpackage.drjr;
import defpackage.eadz;
import defpackage.eaeb;
import defpackage.edxt;
import defpackage.fqhm;
import defpackage.fqns;
import defpackage.fqnv;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PreviewChimeraActivity extends rxx implements AdapterView.OnItemClickListener, bcpv, bctz, bcuf {
    public HelpConfig j;
    public bckv k;

    static {
        ausn.b("PreviewActivity", auid.FEEDBACK);
    }

    private final void l(ErrorReport errorReport) {
        try {
            this.k = new bckv(this, errorReport);
            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter((ListAdapter) this.k);
            listView.setOnItemClickListener(this);
        } catch (NoSuchFieldException unused) {
        }
    }

    private final void m() {
        View findViewById = findViewById(R.id.loader_container);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // defpackage.bcpv
    public final void J(bcol bcolVar) {
        ErrorReport b = bcsh.b();
        if (b == null) {
            return;
        }
        m();
        l(b);
    }

    @Override // defpackage.bctz
    public final void a() {
        finish();
    }

    @Override // defpackage.bcuf
    public final void k() {
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fqhm.c() && getPackageManager().hasSystemFeature("android.software.communal_mode")) {
            getWindow().addFlags(524416);
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("page_name");
        if (stringExtra != null) {
            ErrorReport b = bcsh.b();
            if (b == null) {
                finish();
                return;
            }
            if (fqnv.c()) {
                blah.b(this, b, R.style.Feedback_Activity_Theme_Light_GM3Expressive, R.style.Feedback_Activity_Theme_Dark_GM3Expressive, R.style.Feedback_Activity_Theme_DayNight_GM3Expressive);
                int i = edxt.a;
            } else {
                blah.b(this, b, R.style.Feedback_Activity_Theme_Light, R.style.Feedback_Activity_Theme_Dark, R.style.Feedback_Activity_Theme_DayNight);
            }
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setId(R.id.frag_container_preview_activity);
            if (fqnv.c()) {
                frameLayout.setBackgroundColor(drjr.b(R.dimen.gm3_sys_elevation_level2, this));
            }
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (fqns.a.lK().f()) {
                eaeb.a(frameLayout, eadz.c);
            }
            setContentView(frameLayout);
            if (stringExtra.equals("page_system_info")) {
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.z(R.id.frag_container_preview_activity, new bcua(), "SystemInformationFragment");
                bpVar.a();
                return;
            } else {
                if (!stringExtra.equals("page_system_logs")) {
                    throw new IllegalStateException("Can't handle page ".concat(stringExtra));
                }
                bp bpVar2 = new bp(getSupportFragmentManager());
                bpVar2.z(R.id.frag_container_preview_activity, new bcug(), "SystemInformationFragment");
                bpVar2.a();
                return;
            }
        }
        if (!intent.hasExtra("EXTRA_HELP_CONFIG") && (bundle == null || bundle.getParcelable("EXTRA_HELP_CONFIG") == null)) {
            ErrorReport b2 = bcsh.b();
            if (b2 == null) {
                finish();
                return;
            }
            if (fqnv.c()) {
                blah.b(this, b2, R.style.Feedback_Activity_Dialog_Theme_GM3Expressive, R.style.Feedback_Activity_Dialog_Theme_Dark_GM3Expressive, R.style.Feedback_Activity_Dialog_Theme_DayNight_GM3Expressive);
            } else {
                blah.b(this, b2, R.style.Feedback_Activity_Dialog_Theme, R.style.Feedback_Activity_Dialog_Theme_Dark, R.style.Feedback_Activity_Dialog_Theme_DayNight);
            }
            setContentView(R.layout.show_list_activity);
            ((MaterialToolbar) findViewById(R.id.toolbar_preview_activity)).A(R.string.gf_preview_feedback);
            bcpw.b(this);
            bcsh.c();
            m();
            l(b2);
            return;
        }
        HelpConfig e = HelpConfig.e(this, bundle, intent);
        if (e == null) {
            throw new IllegalStateException("No HelpConfig provided!");
        }
        this.j = e;
        if (fqnv.c()) {
            blah.c(this, e, R.style.Feedback_Activity_Dialog_Theme_GM3Expressive, R.style.Feedback_Activity_Dialog_Theme_Dark_GM3Expressive, R.style.Feedback_Activity_Dialog_Theme_DayNight_GM3Expressive);
        } else {
            blah.c(this, e, R.style.Feedback_Activity_Dialog_Theme, R.style.Feedback_Activity_Dialog_Theme_Dark, R.style.Feedback_Activity_Dialog_Theme_DayNight);
        }
        setContentView(R.layout.gf_preview_activity);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.toolbar_preview_activity);
        if (materialToolbar != null) {
            materialToolbar.A(R.string.gf_account_and_system_info_title);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.gf_account_and_system_info_viewer);
        recyclerView.aj(new LinearLayoutManager());
        recyclerView.ah(new bcja(this));
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        bcpw.d(this);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        bckv bckvVar = this.k;
        if (bckvVar != null) {
            bcku bckuVar = (bcku) bckvVar.a.get(i);
            if (bckuVar.a()) {
                Intent intent = new Intent();
                PreviewChimeraActivity previewChimeraActivity = bckvVar.b;
                Intent className = intent.setClassName(previewChimeraActivity, bckuVar.c);
                className.putExtra("feedback.FIELD_NAME", bckuVar.a);
                String str = bckuVar.f;
                className.putExtra("feedback.FIELD_VALUE", str);
                if (str.equals("product specific binary file path") || str.equals("service dump")) {
                    className.putExtra("feedback.OBJECT_VALUE", bckuVar.e.toString());
                }
                className.putExtra("extra_theme_dialog", true);
                previewChimeraActivity.startActivity(className);
            }
        }
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        HelpConfig helpConfig = this.j;
        if (helpConfig != null) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", helpConfig);
            bundle.putLong("EXTRA_START_TICK", this.j.ag);
        }
    }
}
