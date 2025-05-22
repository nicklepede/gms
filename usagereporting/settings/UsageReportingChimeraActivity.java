package com.google.android.gms.usagereporting.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.SwitchBar;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.usagereporting.settings.UsageReportingChimeraActivity;
import defpackage.aszs;
import defpackage.atad;
import defpackage.auid;
import defpackage.auio;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.auvx;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.czgg;
import defpackage.dhlk;
import defpackage.dkbk;
import defpackage.dkbl;
import defpackage.dkbn;
import defpackage.dkcw;
import defpackage.dkdi;
import defpackage.dkdq;
import defpackage.dozs;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.fvnv;
import defpackage.ig;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UsageReportingChimeraActivity extends rxx implements View.OnClickListener, auvx {
    private static final ausn j = ausn.b("UsageReportingActivity", auid.USAGE_REPORTING);
    private SwitchBar k;
    private TextView l;
    private TextView m;
    private boolean n;
    private dkbn o;
    private bsxr p;
    private atad q;

    private final View n(int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        ((eluo) j.i()).z("Could not find view: id=%d", i);
        return null;
    }

    @Override // defpackage.auvx
    public final void a(boolean z) {
        auio auioVar;
        this.q.aM(new UsageReportingOptInOptions(true != z ? 2 : 1));
        if (z) {
            auioVar = auio.USAGEREPORTING_CHECKBOX_OPT_IN;
        } else {
            aszs aszsVar = czgg.a;
            new atad((Context) this, (short[]) null).aq();
            auioVar = auio.USAGEREPORTING_CHECKBOX_OPT_OUT;
        }
        bsxr.a(auioVar);
    }

    public final void k() {
        this.q.aK().x(new dhlk() { // from class: dkdp
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                if (!dhlwVar.m() || dhlwVar.i() == null) {
                    return;
                }
                UsageReportingChimeraActivity.this.l(((atat) dhlwVar.i()).q());
            }
        });
    }

    public final void l(boolean z) {
        SwitchBar switchBar = this.k;
        if (switchBar != null) {
            switchBar.setChecked(z);
        }
    }

    protected final void m() {
        startActivity(new Intent("android.intent.action.VIEW").setData(dozs.a(this)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getClass();
        if (view == this.m) {
            m();
            bsxr.a(auio.USAGEREPORTING_ON_CLICK_LEARN_MORE);
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        ekww ekwwVar = bsxv.a;
        this.p = new bsxr();
        getApplicationContext();
        dkdi.e();
        this.n = !dkcw.g();
        setContentView(R.layout.usage_reporting);
        ig hO = hO();
        hO.o(true);
        if (auqx.r(this)) {
            hO.M();
        }
        SwitchBar switchBar = (SwitchBar) n(R.id.switch_bar);
        this.k = switchBar;
        if (switchBar != null) {
            switchBar.setEnabled(false);
            if (!this.n) {
                this.k.a = this;
            }
        }
        if (dkcw.d(this)) {
            TextView textView = (TextView) n(R.id.multi_user_info);
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(R.string.usage_reporting_dialog_multi_user_message);
            }
        } else {
            View n = n(R.id.multi_user_info);
            if (n != null) {
                n.setVisibility(8);
            }
        }
        TextView textView2 = (TextView) n(android.R.id.summary);
        this.l = textView2;
        if (textView2 != null) {
            if (fvnv.h()) {
                str = getString(R.string.usage_reporting_dialog_message_dogfood) + "\n\n" + getString(R.string.usage_reporting_dialog_more_message) + "\n\n" + getString(R.string.usage_and_diagnostics_consent_message);
            } else {
                str = getString(R.string.usage_reporting_dialog_message) + "\n\n" + getString(R.string.usage_reporting_dialog_more_message) + "\n\n" + getString(R.string.usage_and_diagnostics_consent_message);
            }
            textView2.setText(str);
        }
        TextView textView3 = (TextView) n(R.id.learn_more_text);
        this.m = textView3;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        dkbk dkbkVar = new dkbk();
        aszs aszsVar = dkbl.a;
        this.q = new atad(this, dkbkVar);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.usage_reporting_settings_menu, menu);
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.settings_help) {
            m();
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStart() {
        super.onStart();
        if (this.n) {
            l(dkcw.e(this));
            SwitchBar switchBar = this.k;
            if (switchBar != null) {
                switchBar.setEnabled(false);
                return;
            }
            return;
        }
        SwitchBar switchBar2 = this.k;
        if (switchBar2 != null) {
            switchBar2.setEnabled(true);
        }
        dkdq dkdqVar = new dkdq(this);
        this.o = dkdqVar;
        this.q.aN(dkdqVar);
        k();
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStop() {
        dkbn dkbnVar;
        if (!this.n && (dkbnVar = this.o) != null) {
            this.q.aQ(dkbnVar);
        }
        super.onStop();
    }
}
