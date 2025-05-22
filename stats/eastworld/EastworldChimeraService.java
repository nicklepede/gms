package com.google.android.gms.stats.eastworld;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.chimera.Service;
import com.google.android.gms.appusage.AppUsageResult;
import com.google.android.gms.chimera.modules.stats.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.atzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dhdf;
import defpackage.dhep;
import defpackage.dhfa;
import defpackage.eluo;
import defpackage.fvcv;
import defpackage.ind;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class EastworldChimeraService extends Service {
    public static final ausn a = ausn.b("EastworldChimeraService", auid.STATS);
    dhdf b;
    private BroadcastReceiver c;
    private PackageUpdateBroadcastReceiver d;
    private AppUsageOrderedBroadcastReceiver e;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class AppUsageOrderedBroadcastReceiver extends TracingBroadcastReceiver {
        public AppUsageOrderedBroadcastReceiver() {
            super("stats");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            ArrayList arrayList;
            long longExtra = intent.getLongExtra("appUsage_startTime", -1L);
            long longExtra2 = intent.getLongExtra("appUsage_endTime", -1L);
            if (longExtra < 0 || longExtra2 < 0) {
                ((eluo) ((eluo) EastworldChimeraService.a.i()).ai(10950)).J("Didn't get correct time range parameters from app usage broadcast, startTime:%d endTime:%d", longExtra, longExtra2);
                return;
            }
            List b = dhep.b(longExtra, longExtra2, intent.getStringArrayListExtra("appUsage_packageNames"));
            Bundle resultExtras = getResultExtras(true);
            Parcelable.Creator creator = AppUsageResult.CREATOR;
            ArrayList arrayList2 = (ArrayList) resultExtras.getSerializable("appUageResult");
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    arrayList3.add(atzs.a((byte[]) arrayList2.get(i), creator));
                }
                arrayList = arrayList3;
            }
            if (arrayList == null) {
                atzs.o(new ArrayList(b), resultExtras);
            } else {
                arrayList.addAll(b);
                HashMap hashMap = new HashMap();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    AppUsageResult appUsageResult = (AppUsageResult) arrayList.get(i2);
                    Pair create = Pair.create(appUsageResult.a, Integer.valueOf(appUsageResult.b));
                    hashMap.put(create, Long.valueOf((hashMap.containsKey(create) ? ((Long) hashMap.get(create)).longValue() : 0L) + appUsageResult.c));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Pair pair : hashMap.keySet()) {
                    arrayList4.add(new AppUsageResult((String) pair.first, ((Integer) pair.second).intValue(), ((Long) hashMap.get(pair)).longValue()));
                }
                atzs.o(arrayList4, resultExtras);
            }
            setResultExtras(resultExtras);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class EastworldBroadcastReceiver extends TracingBroadcastReceiver {
        public EastworldBroadcastReceiver() {
            super("stats");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            EastworldChimeraService.this.b.b(intent);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class PackageUpdateBroadcastReceiver extends TracingBroadcastReceiver {
        public PackageUpdateBroadcastReceiver() {
            super("stats");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            Intent intent2;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                intent2 = intent;
                if (intent2.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    return;
                }
            } else {
                intent2 = intent;
            }
            Uri data = intent2.getData();
            if (data == null) {
                ausn ausnVar = EastworldChimeraService.a;
                return;
            }
            String schemeSpecificPart = data.getSchemeSpecificPart();
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (dhep.a()) {
                if (currentTimeMillis - dhep.b > TimeUnit.DAYS.toMillis(1L)) {
                    Map<String, ?> all = dhep.a().getAll();
                    SharedPreferences.Editor edit = dhep.a().edit();
                    for (String str : all.keySet()) {
                        List c = dhep.c(str);
                        StringBuilder sb = new StringBuilder();
                        Iterator it = c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                if (currentTimeMillis - ((Long) pair.second).longValue() < TimeUnit.DAYS.toMillis(30L)) {
                                    sb.append(pair.first);
                                    sb.append(",");
                                    sb.append(pair.second);
                                    sb.append("|");
                                } else if (sb.toString().isEmpty()) {
                                    edit.remove(str);
                                } else {
                                    edit.putString(str, sb.toString());
                                }
                            }
                        }
                    }
                    edit.apply();
                    dhep.b = currentTimeMillis;
                }
                try {
                    int i = AppContextProvider.a().getPackageManager().getPackageInfo(schemeSpecificPart, 0).versionCode;
                    StringBuilder sb2 = new StringBuilder(dhep.a().getString(schemeSpecificPart, ""));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i);
                    sb3.append(",");
                    sb3.append(currentTimeMillis);
                    sb3.append("|");
                    sb2.insert(0, (CharSequence) sb3);
                    SharedPreferences.Editor edit2 = dhep.a().edit();
                    edit2.putString(schemeSpecificPart, sb2.toString());
                    edit2.apply();
                } catch (PackageManager.NameNotFoundException e) {
                    ((eluo) ((eluo) ((eluo) dhep.a.i()).s(e)).ai(10986)).B("Cannot get updated packageInfo of %s", schemeSpecificPart);
                }
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (dhfa.a()) {
            this.c = new EastworldBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            if (Build.VERSION.SDK_INT < 30) {
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            }
            ind.b(this, this.c, intentFilter, 2);
        }
        if (fvcv.c()) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter2.addDataScheme("package");
            PackageUpdateBroadcastReceiver packageUpdateBroadcastReceiver = new PackageUpdateBroadcastReceiver();
            this.d = packageUpdateBroadcastReceiver;
            ind.b(this, packageUpdateBroadcastReceiver, intentFilter2, 2);
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.android.gms.appusage.report_app_usage.ACTION");
            AppUsageOrderedBroadcastReceiver appUsageOrderedBroadcastReceiver = new AppUsageOrderedBroadcastReceiver();
            this.e = appUsageOrderedBroadcastReceiver;
            ind.b(this, appUsageOrderedBroadcastReceiver, intentFilter3, 2);
        }
        this.b = dhdf.a();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        if (dhfa.a()) {
            unregisterReceiver(this.c);
        }
        if (fvcv.c()) {
            unregisterReceiver(this.d);
            unregisterReceiver(this.e);
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
