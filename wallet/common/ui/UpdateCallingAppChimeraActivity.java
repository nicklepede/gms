package com.google.android.gms.wallet.common.ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.shared.common.ClickSpan;
import defpackage.asng;
import defpackage.assx;
import defpackage.ding;
import defpackage.efeb;
import defpackage.efli;
import defpackage.eflm;
import defpackage.iuo;
import defpackage.qet;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UpdateCallingAppChimeraActivity extends qet implements View.OnClickListener, eflm {
    Button j;
    TextView k;
    efli l;

    private final void k() {
        setResult(1);
        finish();
    }

    @Override // defpackage.eflm
    public final void kt(View view, String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        k();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        ding.C(this, (BuyFlowConfig) getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig"), ding.e, true);
        super.onCreate(bundle);
        setContentView(R.layout.wallet_activity_update_calling_app);
        ht((Toolbar) findViewById(R.id.toolbar));
        TextView textView = (TextView) findViewById(android.R.id.text1);
        this.k = textView;
        textView.setOnClickListener(this);
        TextView textView2 = this.k;
        String q = asng.q(this);
        try {
            ClickSpan.b(textView2, getString(R.string.wallet_update_calling_app, new Object[]{String.format(Locale.US, "<a href=\"market://details?id=%s\">%s</a>", q, assx.b(this).h(q))}), this, ((Boolean) efeb.D.a()).booleanValue());
            efli efliVar = new efli(this.k);
            this.l = efliVar;
            iuo.q(this.k, efliVar);
            Button button = (Button) findViewById(R.id.flat_button);
            this.j = button;
            button.setOnClickListener(this);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new RuntimeException("Couldn't find app name for app to update");
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }
}
