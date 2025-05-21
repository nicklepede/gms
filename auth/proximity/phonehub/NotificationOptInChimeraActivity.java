package com.google.android.gms.auth.proximity.phonehub;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.auth.proximity.phonehub.NotificationOptInChimeraActivity;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class NotificationOptInChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.phone_hub_half_sheet);
        findViewById(R.id.enable_notifications_button).setOnClickListener(new View.OnClickListener() { // from class: acxa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final NotificationOptInChimeraActivity notificationOptInChimeraActivity = NotificationOptInChimeraActivity.this;
                acuq.a(notificationOptInChimeraActivity, new Runnable() { // from class: acwz
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationOptInChimeraActivity notificationOptInChimeraActivity2 = NotificationOptInChimeraActivity.this;
                        acxc.a(notificationOptInChimeraActivity2, false);
                        notificationOptInChimeraActivity2.finish();
                    }
                });
            }
        });
        findViewById(R.id.card).setOnClickListener(null);
        findViewById(R.id.background).setOnClickListener(new View.OnClickListener() { // from class: acxb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationOptInChimeraActivity.this.finish();
            }
        });
    }
}
