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
import defpackage.asej;
import defpackage.asot;
import defpackage.bafe;
import defpackage.bagy;
import defpackage.bagz;
import defpackage.bakp;
import defpackage.balz;
import defpackage.bama;
import defpackage.baol;
import defpackage.baqd;
import defpackage.baqe;
import defpackage.baqj;
import defpackage.baqk;
import defpackage.bivs;
import defpackage.bp;
import defpackage.dozi;
import defpackage.dxry;
import defpackage.dxsa;
import defpackage.eble;
import defpackage.fnpd;
import defpackage.fnvj;
import defpackage.fnvm;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PreviewChimeraActivity extends qet implements AdapterView.OnItemClickListener, balz, baqd, baqj {
    public HelpConfig j;
    public bagz k;

    static {
        asot.b("PreviewActivity", asej.FEEDBACK);
    }

    private final void l(ErrorReport errorReport) {
        try {
            this.k = new bagz(this, errorReport);
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

    @Override // defpackage.balz
    public final void J(bakp bakpVar) {
        ErrorReport b = baol.b();
        if (b == null) {
            return;
        }
        m();
        l(b);
    }

    @Override // defpackage.baqd
    public final void a() {
        finish();
    }

    @Override // defpackage.baqj
    public final void k() {
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fnpd.c() && getPackageManager().hasSystemFeature("android.software.communal_mode")) {
            getWindow().addFlags(524416);
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("page_name");
        if (stringExtra != null) {
            ErrorReport b = baol.b();
            if (b == null) {
                finish();
                return;
            }
            if (fnvm.c()) {
                bivs.b(this, b, R.style.Feedback_Activity_Theme_Light_GM3Expressive, R.style.Feedback_Activity_Theme_Dark_GM3Expressive, R.style.Feedback_Activity_Theme_DayNight_GM3Expressive);
                int i = eble.a;
            } else {
                bivs.b(this, b, R.style.Feedback_Activity_Theme_Light, R.style.Feedback_Activity_Theme_Dark, R.style.Feedback_Activity_Theme_DayNight);
            }
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setId(R.id.frag_container_preview_activity);
            if (fnvm.c()) {
                frameLayout.setBackgroundColor(dozi.b(R.dimen.gm3_sys_elevation_level2, this));
            }
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (fnvj.a.a().f()) {
                dxsa.a(frameLayout, dxry.c);
            }
            setContentView(frameLayout);
            if (stringExtra.equals("page_system_info")) {
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.z(R.id.frag_container_preview_activity, new baqe(), "SystemInformationFragment");
                bpVar.a();
                return;
            } else {
                if (!stringExtra.equals("page_system_logs")) {
                    throw new IllegalStateException("Can't handle page ".concat(stringExtra));
                }
                bp bpVar2 = new bp(getSupportFragmentManager());
                bpVar2.z(R.id.frag_container_preview_activity, new baqk(), "SystemInformationFragment");
                bpVar2.a();
                return;
            }
        }
        if (!intent.hasExtra("EXTRA_HELP_CONFIG") && (bundle == null || bundle.getParcelable("EXTRA_HELP_CONFIG") == null)) {
            ErrorReport b2 = baol.b();
            if (b2 == null) {
                finish();
                return;
            }
            if (fnvm.c()) {
                bivs.b(this, b2, R.style.Feedback_Activity_Dialog_Theme_GM3Expressive, R.style.Feedback_Activity_Dialog_Theme_Dark_GM3Expressive, R.style.Feedback_Activity_Dialog_Theme_DayNight_GM3Expressive);
            } else {
                bivs.b(this, b2, R.style.Feedback_Activity_Dialog_Theme, R.style.Feedback_Activity_Dialog_Theme_Dark, R.style.Feedback_Activity_Dialog_Theme_DayNight);
            }
            setContentView(R.layout.show_list_activity);
            ((MaterialToolbar) findViewById(R.id.toolbar_preview_activity)).A(R.string.gf_preview_feedback);
            bama.b(this);
            baol.c();
            m();
            l(b2);
            return;
        }
        HelpConfig e = HelpConfig.e(this, bundle, intent);
        if (e == null) {
            throw new IllegalStateException("No HelpConfig provided!");
        }
        this.j = e;
        if (fnvm.c()) {
            bivs.c(this, e, R.style.Feedback_Activity_Dialog_Theme_GM3Expressive, R.style.Feedback_Activity_Dialog_Theme_Dark_GM3Expressive, R.style.Feedback_Activity_Dialog_Theme_DayNight_GM3Expressive);
        } else {
            bivs.c(this, e, R.style.Feedback_Activity_Dialog_Theme, R.style.Feedback_Activity_Dialog_Theme_Dark, R.style.Feedback_Activity_Dialog_Theme_DayNight);
        }
        setContentView(R.layout.gf_preview_activity);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.toolbar_preview_activity);
        if (materialToolbar != null) {
            materialToolbar.A(R.string.gf_account_and_system_info_title);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.gf_account_and_system_info_viewer);
        recyclerView.aj(new LinearLayoutManager());
        recyclerView.ah(new bafe(this));
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        bama.d(this);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        bagz bagzVar = this.k;
        if (bagzVar != null) {
            bagy bagyVar = (bagy) bagzVar.a.get(i);
            if (bagyVar.a()) {
                Intent intent = new Intent();
                PreviewChimeraActivity previewChimeraActivity = bagzVar.b;
                Intent className = intent.setClassName(previewChimeraActivity, bagyVar.c);
                className.putExtra("feedback.FIELD_NAME", bagyVar.a);
                String str = bagyVar.f;
                className.putExtra("feedback.FIELD_VALUE", str);
                if (str.equals("product specific binary file path") || str.equals("service dump")) {
                    className.putExtra("feedback.OBJECT_VALUE", bagyVar.e.toString());
                }
                className.putExtra("extra_theme_dialog", true);
                previewChimeraActivity.startActivity(className);
            }
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        HelpConfig helpConfig = this.j;
        if (helpConfig != null) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", helpConfig);
            bundle.putLong("EXTRA_START_TICK", this.j.ag);
        }
    }
}
