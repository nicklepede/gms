package com.google.android.gms.auth;

import android.content.Intent;
import android.util.Log;
import defpackage.atzb;
import defpackage.wjw;
import defpackage.wkp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UserRecoverableAuthException extends wjw {
    private final Intent a;
    private final wkp b;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, wkp.LEGACY);
    }

    public static UserRecoverableAuthException b(String str, Intent intent) {
        atzb.s(intent);
        return new UserRecoverableAuthException(str, intent, wkp.AUTH_INSTANTIATION);
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

    private UserRecoverableAuthException(String str, Intent intent, wkp wkpVar) {
        super(str);
        this.a = intent;
        atzb.s(wkpVar);
        this.b = wkpVar;
    }
}
