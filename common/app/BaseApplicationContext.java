package com.google.android.gms.common.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider;
import defpackage.ardf;
import defpackage.ardl;
import defpackage.arno;
import defpackage.arnp;
import defpackage.arnq;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.dmnn;
import defpackage.dmnx;
import defpackage.eijr;
import defpackage.eike;
import defpackage.fmtg;
import defpackage.fywa;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class BaseApplicationContext extends ContextWrapper {
    private static final String APP_CONTEXT_ATTRIBUTION_TAG = "apkappcontext";
    private static final String TAG = "BaseAppContext";
    private Context baseContext;
    private volatile CronetEngine cronetEngine;
    private volatile CronetEngine cronetEngineHttp1Only;
    private final Object cronetEngineLock;
    private final Object cronetEngineLockHttp1Only;
    private final BaseApplicationContext globalGmsState;
    private volatile boolean inSafeBoot;
    private volatile arnq lazyCronetEngine;
    private volatile arnq lazyCronetEngineHttp1Only;
    private final Object lazyCronetEngineLock;
    private final Object lazyCronetEngineLockHttp1Only;
    private final Map lockMap;

    protected BaseApplicationContext(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ExperimentalCronetEngine getRealCronetEngine() {
        CronetEngine cronetEngine;
        CronetEngine cronetEngine2 = this.cronetEngine;
        if (cronetEngine2 != null && !(cronetEngine2 instanceof fywa)) {
            return (ExperimentalCronetEngine) cronetEngine2;
        }
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext != null) {
            return (ExperimentalCronetEngine) baseApplicationContext.getCronetEngine();
        }
        synchronized (this.cronetEngineLock) {
            cronetEngine = this.cronetEngine;
            if (cronetEngine == null || (cronetEngine instanceof fywa)) {
                asot b = asot.b("CronetEngineFactory", asej.COMMON_API);
                try {
                    cronetEngine = arnp.a(false, b, this);
                } catch (arno unused) {
                    if (cronetEngine == null) {
                        cronetEngine = arnp.b(b, this);
                    } else {
                        Log.e(TAG, "Failed loading Cronet module again, falling back to Java implementation");
                    }
                }
                this.cronetEngine = cronetEngine;
            }
        }
        return (ExperimentalCronetEngine) cronetEngine;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ExperimentalCronetEngine getRealCronetEngineHttp1Only() {
        CronetEngine cronetEngine;
        CronetEngine cronetEngine2 = this.cronetEngineHttp1Only;
        if (cronetEngine2 != null && !(cronetEngine2 instanceof fywa)) {
            return (ExperimentalCronetEngine) cronetEngine2;
        }
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext != null) {
            return (ExperimentalCronetEngine) baseApplicationContext.getCronetEngineHttp1Only();
        }
        synchronized (this.cronetEngineLockHttp1Only) {
            cronetEngine = this.cronetEngineHttp1Only;
            if (cronetEngine == null || (cronetEngine instanceof fywa)) {
                asot b = asot.b("CronetEngineFactory", asej.COMMON_API);
                try {
                    cronetEngine = arnp.a(true, b, this);
                } catch (arno unused) {
                    if (cronetEngine == null) {
                        cronetEngine = arnp.b(b, this);
                    } else {
                        Log.e(TAG, "Failed loading Cronet module again, falling back to Java implementation");
                    }
                }
                this.cronetEngineHttp1Only = cronetEngine;
            }
        }
        return (ExperimentalCronetEngine) cronetEngine;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        this.baseContext = context;
        if (asqh.g()) {
            context = context.createAttributionContext(APP_CONTEXT_ATTRIBUTION_TAG);
        }
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context createAttributionContext(String str) {
        return new ardf(this, super.createAttributionContext(str));
    }

    public Context createCredentialProtectedStorageContext() {
        return new ardf(this, super.createCredentialProtectedStorageContext());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context createDeviceProtectedStorageContext() {
        return new ardf(this, super.createDeviceProtectedStorageContext());
    }

    @Override // android.content.ContextWrapper
    public Context getBaseContext() {
        Context context = this.baseContext;
        eike.e(context);
        return context;
    }

    public CronetEngine getCronetEngine() {
        if (!fmtg.c()) {
            return getRealCronetEngine();
        }
        synchronized (this.lazyCronetEngineLock) {
            if (this.lazyCronetEngine == null) {
                this.lazyCronetEngine = new arnq(new eijr() { // from class: ardg
                    @Override // defpackage.eijr
                    public final Object a() {
                        ExperimentalCronetEngine realCronetEngine;
                        realCronetEngine = BaseApplicationContext.this.getRealCronetEngine();
                        return realCronetEngine;
                    }
                });
            }
        }
        return this.lazyCronetEngine;
    }

    public CronetEngine getCronetEngineHttp1Only() {
        if (!fmtg.c()) {
            return getRealCronetEngineHttp1Only();
        }
        synchronized (this.lazyCronetEngineLockHttp1Only) {
            if (this.lazyCronetEngineHttp1Only == null) {
                this.lazyCronetEngineHttp1Only = new arnq(new eijr() { // from class: ardh
                    @Override // defpackage.eijr
                    public final Object a() {
                        ExperimentalCronetEngine realCronetEngineHttp1Only;
                        realCronetEngineHttp1Only = BaseApplicationContext.this.getRealCronetEngineHttp1Only();
                        return realCronetEngineHttp1Only;
                    }
                });
            }
        }
        return this.lazyCronetEngineHttp1Only;
    }

    protected BaseApplicationContext getGlobalState() {
        return this.globalGmsState;
    }

    public boolean getInSafeBoot() {
        return this.inSafeBoot;
    }

    public ConcurrentMap getLockMap(String str) {
        ConcurrentMap concurrentMap;
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext != null) {
            return baseApplicationContext.getLockMap(str);
        }
        synchronized (this.lockMap) {
            concurrentMap = (ConcurrentMap) this.lockMap.get(str);
            if (concurrentMap == null) {
                concurrentMap = ConcurrentMapFactory.newConcurrentHashMap();
                this.lockMap.put(str, concurrentMap);
            }
        }
        return concurrentMap;
    }

    public synchronized RadiosTracingLoggerProvider.NetworkActivityLogger getNetworkActivityLogger() {
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext != null) {
            return baseApplicationContext.getNetworkActivityLogger();
        }
        return RadiosTracingLoggerProvider.NOOP_ACTIVITY_LOGGER;
    }

    public synchronized RadiosTracingLoggerProvider.NetworkLatencyLogger getNetworkLatencyLogger() {
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext != null) {
            return baseApplicationContext.getNetworkLatencyLogger();
        }
        return RadiosTracingLoggerProvider.NOOP_LATENCY_LOGGER;
    }

    public ScheduledExecutorService getPhenotypeBaseExecutor() {
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        return baseApplicationContext != null ? baseApplicationContext.getPhenotypeBaseExecutor() : (ScheduledExecutorService) ardl.a.a();
    }

    public void gservicesBulkCacheByPrefix(String[] strArr) {
        dmnn.i(getContentResolver(), strArr);
    }

    public boolean gservicesGetBoolean(String str, boolean z) {
        return dmnn.k(getContentResolver(), str, z);
    }

    public float gservicesGetFloat(String str, float f) {
        Object obj;
        Float f2;
        ContentResolver contentResolver = getContentResolver();
        dmnx dmnxVar = dmnn.a;
        ContentResolver a = dmnxVar.a(contentResolver);
        synchronized (dmnxVar) {
            dmnxVar.d(a);
            obj = dmnxVar.f;
            f2 = (Float) dmnx.f(dmnxVar.e, str, Float.valueOf(f));
        }
        if (f2 != null) {
            return f2.floatValue();
        }
        String b = dmnxVar.b(a, str, null);
        if (b != null) {
            try {
                float parseFloat = Float.parseFloat(b);
                f2 = Float.valueOf(parseFloat);
                f = parseFloat;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (dmnxVar) {
            dmnxVar.e(obj, dmnxVar.e, str, f2);
        }
        return f;
    }

    public int gservicesGetInt(String str, int i) {
        return dmnn.a(getContentResolver(), str, i);
    }

    public long gservicesGetLong(String str, long j) {
        return dmnn.c(getContentResolver(), str, j);
    }

    public String gservicesGetString(String str, String str2) {
        return dmnn.g(getContentResolver(), str, str2);
    }

    public Map gservicesGetStringsByPrefix(String[] strArr) {
        return dmnn.h(getContentResolver(), strArr);
    }

    public Object gservicesGetVersionToken() {
        return dmnn.d(getContentResolver());
    }

    protected boolean isFromContainer() {
        return BaseApplicationContext.class.getClassLoader() == getClassLoader() || ModuleManager.get(this).getCurrentModuleApk().apkRequired;
    }

    public void setInSafeBoot() {
        this.inSafeBoot = true;
    }

    protected BaseApplicationContext(Context context, BaseApplicationContext baseApplicationContext) {
        super(context);
        this.inSafeBoot = false;
        this.cronetEngineLock = new Object();
        this.lazyCronetEngineLock = new Object();
        this.cronetEngineLockHttp1Only = new Object();
        this.lazyCronetEngineLockHttp1Only = new Object();
        this.baseContext = context;
        this.globalGmsState = baseApplicationContext;
        this.lockMap = baseApplicationContext == null ? new HashMap() : baseApplicationContext.lockMap;
    }

    public void watchForLeaks(Object obj) {
    }
}
