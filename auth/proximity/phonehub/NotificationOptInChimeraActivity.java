package com.google.android.gms.auth.proximity.phonehub;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.auth.proximity.phonehub.NotificationOptInChimeraActivity;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class NotificationOptInChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.phone_hub_half_sheet);
        findViewById(R.id.enable_notifications_button).setOnClickListener(new View.OnClickListener() { // from class: aexa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final NotificationOptInChimeraActivity notificationOptInChimeraActivity = NotificationOptInChimeraActivity.this;
                aeuq.a(notificationOptInChimeraActivity, new Runnable() { // from class: aewz
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationOptInChimeraActivity notificationOptInChimeraActivity2 = NotificationOptInChimeraActivity.this;
                        aexc.a(notificationOptInChimeraActivity2, false);
                        notificationOptInChimeraActivity2.finish();
                    }
                });
            }
        });
        findViewById(R.id.card).setOnClickListener(null);
        findViewById(R.id.background).setOnClickListener(new View.OnClickListener() { // from class: aexb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationOptInChimeraActivity.this.finish();
            }
        });
    }
}
