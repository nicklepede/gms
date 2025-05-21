package com.google.android.gms.semanticlocationhistory.isolation;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.BoundService;
import defpackage.a;
import defpackage.bqog;
import defpackage.eike;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class IsolatedBoundService extends BoundService {
    private final Map a = new HashMap();

    private static final Binder a(String str) {
        try {
            Binder binder = (Binder) Class.forName(str).asSubclass(Binder.class).getConstructor(null).newInstance(null);
            if (binder instanceof RemoteOdlhNativeLibImpl) {
                return binder;
            }
            throw new ClassCastException(a.r(str, " must implement IsolatedStub"));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("SLH_ISOLATED_SVC", a.o(str, e, "Failed to instantiate Binder class ", ":"));
            throw new IllegalStateException(e);
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        eike.e(action);
        if (!action.equals("com.google.android.gms.semanticlocationhistory.BIND_NATIVE_LIB") && !action.equals("com.google.android.gms.semanticlocationhistory.BIND_NATIVE_LIB_ISOLATED")) {
            Log.e("SLH_ISOLATED_SVC", a.a(action, "onBind: unexpected intent action ", ", discarding"));
            throw new IllegalStateException("unexpected action ".concat(action));
        }
        String stringExtra = intent.getStringExtra("implclassname");
        if (stringExtra == null) {
            Log.e("SLH_ISOLATED_SVC", "implClassName must be set in the intent.");
            throw new IllegalStateException("implClassName is null for ".concat(action));
        }
        Binder a = a(stringExtra);
        if (a != null) {
            this.a.put(stringExtra, (RemoteOdlhNativeLibImpl) a);
            return new bqog(a);
        }
        Log.e("SLH_ISOLATED_SVC", "cannot create binder stub for ".concat(stringExtra));
        throw new IllegalStateException("cant create binder for ".concat(action));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        this.a.clear();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        String action = intent.getAction();
        eike.e(action);
        if (!action.equals("com.google.android.gms.semanticlocationhistory.BIND_NATIVE_LIB") && !action.equals("com.google.android.gms.semanticlocationhistory.BIND_NATIVE_LIB_ISOLATED")) {
            Log.e("SLH_ISOLATED_SVC", a.a(action, "onUnbind: unexpected intent action ", ", discarding"));
            return false;
        }
        RemoteOdlhNativeLibImpl remoteOdlhNativeLibImpl = (RemoteOdlhNativeLibImpl) this.a.get(intent.getStringExtra("implclassname"));
        if (remoteOdlhNativeLibImpl == null) {
            return true;
        }
        if (!remoteOdlhNativeLibImpl.a) {
            Log.w("RemoteOdlhNativeLibImpl", "stub loading failed or never been called, ignoring unload()");
            return true;
        }
        remoteOdlhNativeLibImpl.nativeUnload();
        remoteOdlhNativeLibImpl.a = false;
        return true;
    }
}
