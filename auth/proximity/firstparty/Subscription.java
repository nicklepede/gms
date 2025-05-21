package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class Subscription extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract PendingIntent a();

    public abstract String b();

    public final void d(Context context, Bundle bundle) {
        Intent intent = new Intent();
        intent.setPackage(b());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        a().send(context, 0, intent);
    }
}
