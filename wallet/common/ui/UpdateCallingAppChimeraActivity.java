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
import defpackage.aura;
import defpackage.auwr;
import defpackage.dkyr;
import defpackage.ehre;
import defpackage.ehyl;
import defpackage.ehyp;
import defpackage.iwe;
import defpackage.rxx;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UpdateCallingAppChimeraActivity extends rxx implements View.OnClickListener, ehyp {
    Button j;
    TextView k;
    ehyl l;

    private final void k() {
        setResult(1);
        finish();
    }

    @Override // defpackage.ehyp
    public final void kI(View view, String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        k();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        dkyr.C(this, (BuyFlowConfig) getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig"), dkyr.e, true);
        super.onCreate(bundle);
        setContentView(R.layout.wallet_activity_update_calling_app);
        hJ((Toolbar) findViewById(R.id.toolbar));
        TextView textView = (TextView) findViewById(android.R.id.text1);
        this.k = textView;
        textView.setOnClickListener(this);
        TextView textView2 = this.k;
        String q = aura.q(this);
        try {
            ClickSpan.b(textView2, getString(R.string.wallet_update_calling_app, new Object[]{String.format(Locale.US, "<a href=\"market://details?id=%s\">%s</a>", q, auwr.b(this).h(q))}), this, ((Boolean) ehre.D.a()).booleanValue());
            ehyl ehylVar = new ehyl(this.k);
            this.l = ehylVar;
            iwe.q(this.k, ehylVar);
            Button button = (Button) findViewById(R.id.flat_button);
            this.j = button;
            button.setOnClickListener(this);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new RuntimeException("Couldn't find app name for app to update");
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }
}
