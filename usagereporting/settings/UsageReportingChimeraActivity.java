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
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asnd;
import defpackage.asot;
import defpackage.assd;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.cwwi;
import defpackage.dfae;
import defpackage.dhqe;
import defpackage.dhqf;
import defpackage.dhqh;
import defpackage.dhrq;
import defpackage.dhsa;
import defpackage.dhsi;
import defpackage.dmoe;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.fssf;
import defpackage.ig;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UsageReportingChimeraActivity extends qet implements View.OnClickListener, assd {
    private static final asot j = asot.b("UsageReportingActivity", asej.USAGE_REPORTING);
    private SwitchBar k;
    private TextView l;
    private TextView m;
    private boolean n;
    private dhqh o;
    private bqqa p;
    private aqxo q;

    private final View n(int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        ((ejhf) j.i()).z("Could not find view: id=%d", i);
        return null;
    }

    @Override // defpackage.assd
    public final void a(boolean z) {
        aseu aseuVar;
        this.q.aN(new UsageReportingOptInOptions(true != z ? 2 : 1));
        if (z) {
            aseuVar = aseu.USAGEREPORTING_CHECKBOX_OPT_IN;
        } else {
            aqxd aqxdVar = cwwi.a;
            new aqxo((Context) this, (short[]) null).ar();
            aseuVar = aseu.USAGEREPORTING_CHECKBOX_OPT_OUT;
        }
        bqqa.a(aseuVar);
    }

    public final void k() {
        this.q.aL().x(new dfae() { // from class: dhsh
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                if (!dfaqVar.m() || dfaqVar.i() == null) {
                    return;
                }
                UsageReportingChimeraActivity.this.l(((aqye) dfaqVar.i()).r());
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
        startActivity(new Intent("android.intent.action.VIEW").setData(dmoe.a(this)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getClass();
        if (view == this.m) {
            m();
            bqqa.a(aseu.USAGEREPORTING_ON_CLICK_LEARN_MORE);
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        eijr eijrVar = bqqe.a;
        this.p = new bqqa();
        getApplicationContext();
        dhsa.e();
        this.n = !dhrq.g();
        setContentView(R.layout.usage_reporting);
        ig hy = hy();
        hy.o(true);
        if (asnd.r(this)) {
            hy.M();
        }
        SwitchBar switchBar = (SwitchBar) n(R.id.switch_bar);
        this.k = switchBar;
        if (switchBar != null) {
            switchBar.setEnabled(false);
            if (!this.n) {
                this.k.a = this;
            }
        }
        if (dhrq.d(this)) {
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
            if (fssf.h()) {
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
        dhqe dhqeVar = new dhqe();
        aqxd aqxdVar = dhqf.a;
        this.q = new aqxo(this, dhqeVar);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.usage_reporting_settings_menu, menu);
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStart() {
        super.onStart();
        if (this.n) {
            l(dhrq.e(this));
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
        dhsi dhsiVar = new dhsi(this);
        this.o = dhsiVar;
        this.q.aO(dhsiVar);
        k();
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStop() {
        dhqh dhqhVar;
        if (!this.n && (dhqhVar = this.o) != null) {
            this.q.aR(dhqhVar);
        }
        super.onStop();
    }
}
