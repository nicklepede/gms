package com.google.android.gms.trustagent;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService;
import defpackage.byhr;
import defpackage.dgks;
import defpackage.dgkt;
import defpackage.dglm;
import j$.util.Objects;
import java.util.concurrent.FutureTask;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GoogleTrustAgentFirstNotificationChimeraActivity extends dglm {
    public boolean j;
    private Handler k;
    private FutureTask l;

    @Override // defpackage.dglm, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.auth_trust_agent_first_notification);
        this.j = false;
        ((Button) findViewById(R.id.auth_trust_agent_first_use_notification_button_id)).setOnClickListener(new dgks(this));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("type");
            String string2 = extras.getString("name");
            TextView textView = (TextView) findViewById(R.id.auth_trust_agent_first_use_notification_message_id);
            if (Objects.equals(string, BluetoothTrustletChimeraService.class.getName())) {
                textView.setText(getString(R.string.auth_trust_agent_first_use_notification_message_device, new Object[]{string2}));
            } else if (Objects.equals(string, "Place")) {
                textView.setText(getString(R.string.auth_trust_agent_first_use_notification_message_place, new Object[]{string2}));
            } else if (Objects.equals(string, "PhonePosition")) {
                textView.setText(getString(R.string.auth_trust_agent_first_use_notification_message_position));
            }
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        FutureTask futureTask = this.l;
        if (futureTask != null) {
            futureTask.cancel(true);
            this.l = null;
        }
        if (this.j) {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        this.k = new byhr();
        FutureTask futureTask = new FutureTask(new dgkt(this), null);
        this.l = futureTask;
        this.k.postDelayed(futureTask, 500L);
    }
}
