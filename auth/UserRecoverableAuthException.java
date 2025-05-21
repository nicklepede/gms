package com.google.android.gms.auth;

import android.content.Intent;
import android.util.Log;
import defpackage.arwm;
import defpackage.unx;
import defpackage.uoq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UserRecoverableAuthException extends unx {
    private final Intent a;
    private final uoq b;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, uoq.LEGACY);
    }

    public static UserRecoverableAuthException b(String str, Intent intent) {
        arwm.s(intent);
        return new UserRecoverableAuthException(str, intent, uoq.AUTH_INSTANTIATION);
    }

    public final Intent a() {
        Intent intent = this.a;
        if (intent != null) {
            return new Intent(intent);
        }
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (ordinal == 1) {
            Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        }
        if (ordinal != 2) {
            return null;
        }
        Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
        return null;
    }

    private UserRecoverableAuthException(String str, Intent intent, uoq uoqVar) {
        super(str);
        this.a = intent;
        arwm.s(uoqVar);
        this.b = uoqVar;
    }
}
