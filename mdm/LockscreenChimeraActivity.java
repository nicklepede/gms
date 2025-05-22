package com.google.android.gms.mdm;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aura;
import defpackage.cfbv;
import defpackage.cfco;
import defpackage.cfjj;
import defpackage.fuos;
import defpackage.iri;
import defpackage.kar;
import defpackage.ph;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LockscreenChimeraActivity extends cfbv {
    Button o;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        if (view == this.k) {
            intent = new Intent("android.intent.action.CALL");
            intent.setData(Uri.parse(String.format("tel:%1$s", this.l)));
            intent.setFlags(8388608);
        } else if (view == this.o) {
            intent = new Intent("com.android.phone.EmergencyDialer.DIAL");
            intent.setFlags(8388608);
        } else {
            intent = null;
        }
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        String str = queryIntentActivities.isEmpty() ? null : queryIntentActivities.get(0).activityInfo.packageName;
        if (str != null) {
            intent.setPackage(str);
        }
        startActivity(intent);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("lock_message");
        if (TextUtils.isEmpty(stringExtra)) {
            cfjj.a("LockscreenActivity started without a lock message, closing.", new Object[0]);
            setResult(0);
            finish();
            return;
        }
        getWindow().addFlags(2621440);
        setContentView(R.layout.mdm_lockscreen_activity);
        ((TextView) findViewById(R.id.lock_message)).setText(stringExtra);
        this.k = (ImageButton) findViewById(R.id.phone_number_call);
        TextView textView = (TextView) findViewById(R.id.phone_number_call_label);
        if (getIntent().hasExtra("phone_number")) {
            this.l = getIntent().getStringExtra("phone_number");
            this.k.setImageDrawable(ph.d().c(this, R.drawable.mdm_ic_call));
            this.k.setOnClickListener(this);
        } else {
            this.k.setVisibility(8);
            textView.setVisibility(8);
        }
        Button button = (Button) findViewById(R.id.emergency_call);
        this.o = button;
        button.setOnClickListener(this);
        if (aura.O(this)) {
            setRequestedOrientation(1);
        } else {
            this.o.setVisibility(8);
        }
        this.m = kar.a(this);
        this.m.c(this.n, j);
        new cfco().a();
        if (fuos.a.lK().l()) {
            int i = iri.a;
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        this.m.d(this.n);
        super.onDestroy();
    }
}
