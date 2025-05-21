package com.google.android.gms.chimera.container;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.chimera.container.gmsplatform.PackageWatcher$PackageStateReceiver;
import com.google.android.gms.dynamite.DynamiteModuleData;
import defpackage.anyf;
import defpackage.anyg;
import defpackage.aodj;
import defpackage.aodn;
import defpackage.aodo;
import defpackage.aodp;
import defpackage.aodq;
import defpackage.aohx;
import defpackage.aoib;
import defpackage.aoie;
import defpackage.arut;
import defpackage.arxd;
import defpackage.aseu;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asqw;
import defpackage.asrg;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.byik;
import defpackage.dnnr;
import defpackage.eiif;
import defpackage.eijj;
import defpackage.eijr;
import defpackage.eike;
import defpackage.eksg;
import defpackage.eqwk;
import defpackage.fecj;
import defpackage.fmuf;
import defpackage.fmwd;
import defpackage.pph;
import defpackage.ppt;
import defpackage.pqm;
import defpackage.prb;
import defpackage.prc;
import defpackage.psu;
import defpackage.pup;
import defpackage.puq;
import defpackage.pvn;
import defpackage.pvp;
import defpackage.pvq;
import defpackage.pwe;
import defpackage.pzw;
import defpackage.qac;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsModuleChimeraProvider extends prc implements byik {
    private static final UriMatcher d;
    private asrg e;
    private Context f;
    private aodq g;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        d = uriMatcher;
        uriMatcher.addURI("*", "api/*", 1);
        uriMatcher.addURI("*", "api_force_staging/*", 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long d(android.net.Uri r4) {
        /*
            r0 = 0
            java.lang.String r2 = "requestStartUptime"
            java.lang.String r4 = r4.getQueryParameter(r2)     // Catch: java.lang.UnsupportedOperationException -> Lf java.lang.NumberFormatException -> L11
            if (r4 == 0) goto L19
            long r2 = java.lang.Long.parseLong(r4)     // Catch: java.lang.UnsupportedOperationException -> Lf java.lang.NumberFormatException -> L11
            goto L1a
        Lf:
            r4 = move-exception
            goto L12
        L11:
            r4 = move-exception
        L12:
            java.lang.String r2 = "GmsModuleProvider"
            java.lang.String r3 = "invalid request start time"
            android.util.Log.w(r2, r3, r4)
        L19:
            r2 = r0
        L1a:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L1f
            return r0
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.GmsModuleChimeraProvider.d(android.net.Uri):long");
    }

    @Override // defpackage.prc
    protected final Bundle a(String str) {
        Bundle bundle;
        int a;
        aodo a2;
        PendingIntent pendingIntent;
        Intent startIntent = BoundService.getStartIntent(this.c, str);
        if (startIntent == null) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putParcelable("serviceResponseIntentKey", startIntent);
        }
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        aodq aodqVar = this.g;
        String str2 = (String) aodqVar.c.get(str);
        if (str2 == null) {
            String b = fmwd.a.a().b();
            str2 = b.isEmpty() ? null : (String) eijj.g(",").i().d().o().a(b).get(str);
        }
        if (str2 == null) {
            aodn a3 = aodo.a();
            a3.b(false);
            a2 = a3.a();
        } else {
            aodp aodpVar = aodqVar.b;
            Map map = aodpVar.d;
            synchronized (map) {
                if (map.containsKey(str2)) {
                    a = ((Integer) aodpVar.d.get(str2)).intValue();
                } else {
                    PackageWatcher$PackageStateReceiver packageWatcher$PackageStateReceiver = aodpVar.b;
                    synchronized (packageWatcher$PackageStateReceiver) {
                        if (!aodpVar.c) {
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                            intentFilter.addDataScheme("package");
                            aodpVar.a.registerReceiver(packageWatcher$PackageStateReceiver, intentFilter, null, new aslv(new aslw(9)));
                            aodpVar.c = true;
                        }
                    }
                    a = aodpVar.a(str2);
                }
            }
            if (a == 0) {
                aodn a4 = aodo.a();
                a4.b(false);
                a4.b = PendingIntent.getActivity(aodqVar.a, 0, arut.b(str2), 67108864);
                a2 = a4.a();
            } else if (a != 2) {
                aodn a5 = aodo.a();
                a5.b(false);
                a2 = a5.a();
            } else {
                aodn a6 = aodo.a();
                a6.b(true);
                a6.a = new Intent(str).setPackage(str2);
                a2 = a6.a();
            }
        }
        if (a2.a) {
            bundle2.putParcelable("serviceResponseIntentKey", a2.b);
        } else if (fmwd.a.a().c() && (pendingIntent = a2.c) != null) {
            bundle2.putParcelable("serviceMissingResolutionIntentKey", pendingIntent);
        }
        if (bundle2.isEmpty()) {
            return null;
        }
        return bundle2;
    }

    @Override // defpackage.prc
    public final void c() {
        aodj.d().g();
    }

    @Override // defpackage.prc, com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        char c;
        if ("api_dynamite_module_call".equals(str)) {
            if (!fmuf.a.a().h()) {
                Log.i("GmsModuleProvider", "Dynamite Module call interface not enabled.");
                return null;
            }
            if (bundle == null) {
                Log.w("GmsModuleProvider", "Parameters must be provided in extras.");
                return null;
            }
            String string = bundle.getString("api_dynamite_module_module_id", "");
            if (eiif.c(string)) {
                Log.w("GmsModuleProvider", "No valid module id!");
                return null;
            }
            if (!bundle.containsKey("api_dynamite_module_force_staging")) {
                Log.w("GmsModuleProvider", "Force staging should be specified!");
                return null;
            }
            boolean z = bundle.getBoolean("api_dynamite_module_force_staging", false);
            long j = bundle.getLong("api_dynamite_module_start_time_ms", 0L);
            DynamiteModuleData e = aodj.d().e(this.f, this.e, j < 0 ? 0L : j, string, z, true, getCallingPackage());
            Bundle bundle2 = new Bundle(1);
            if (e == null) {
                return bundle2;
            }
            bundle2.putByteArray("api_dynamite_module_data", arxd.n(e));
            eijr eijrVar = bqqe.a;
            bqqa.a(aseu.CHIMERA_DYNAMITE_MODULE_CALL_RESOLVED);
            return bundle2;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1102730960) {
            if (str.equals("featureCheckCall")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -135988305) {
            if (hashCode == 1556259298 && str.equals("featureFetchCall")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("serviceIntentCall")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            Bundle bundle3 = new Bundle();
            byte[] byteArray = bundle != null ? bundle.getByteArray("featuresBundleKey") : null;
            if (byteArray == null) {
                Log.e("ModuleProvider", "Missing extras key: featureCheckCall");
                bundle3.putInt("featuresResult", 3);
                return bundle3;
            }
            pvp b = b();
            if (b != null) {
                bundle3.putInt("featuresResult", pzw.b(b, byteArray));
                return bundle3;
            }
            Log.e("ModuleProvider", "An error occurred while trying to load the container features. All client api feature requests will fail.");
            bundle3.putInt("featuresResult", 3);
            return bundle3;
        }
        if (c != 1) {
            if (c != 2) {
                return null;
            }
            String string2 = bundle == null ? null : bundle.getString("serviceActionBundleKey");
            if (string2 != null) {
                return a(string2);
            }
            Log.e("ModuleProvider", "Missing action in extras: serviceIntentCall");
            return null;
        }
        Bundle bundle4 = new Bundle();
        if (bundle == null) {
            Log.e("ModuleProvider", "Missing extras bundle");
            bundle4.putInt("featuresResult", 3);
            return bundle4;
        }
        String[] stringArray = bundle.getStringArray("featureNamesBundleKey");
        if (stringArray == null || stringArray.length == 0) {
            Log.e("ModuleProvider", "Missing feature names to fetch for key: featureNamesBundleKey");
            bundle4.putInt("featuresResult", 3);
            return bundle4;
        }
        pvp b2 = b();
        if (b2 == null) {
            Log.e("ModuleProvider", "An error occurred while trying to load the container features. All client api feature requests will fail.");
            bundle4.putInt("featuresResult", 3);
            return bundle4;
        }
        List c2 = pzw.c(b2, Arrays.asList(stringArray));
        fecj v = puq.a.v();
        v.ae(c2);
        bundle4.putByteArray("featuresResponseListKey", ((puq) v.Q()).r());
        bundle4.putInt("featuresResult", 0);
        return bundle4;
    }

    @Override // defpackage.prc, com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        pvp pvpVar;
        String str2;
        pph f = pph.f();
        try {
            pvp j = f.j();
            qac n = f.n(j);
            printWriter.println("Module Sets:");
            int size = n.size();
            int i = 0;
            while (true) {
                str = "  ";
                if (i >= size) {
                    break;
                }
                eksg eksgVar = (eksg) n.get(i);
                StringBuilder sb = new StringBuilder("  ");
                sb.append("Module Set ID: ");
                sb.append(eksgVar.c);
                sb.append(", Module Set Version: ");
                sb.append(eksgVar.f);
                if ((eksgVar.e & 128) != 0) {
                    sb.append(" (placebo)");
                }
                printWriter.println(sb);
                if (eksgVar.g.size() > 0) {
                    StringBuilder sb2 = new StringBuilder("      ");
                    sb2.append("Enabled features: ");
                    for (int i2 = 0; i2 < eksgVar.g.size(); i2++) {
                        if (i2 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append((String) eksgVar.g.get(i2));
                    }
                    printWriter.println(sb2);
                }
                i++;
            }
            printWriter.println();
            printWriter.println("Configuration Mode(s):");
            int c = j.c();
            if (c == 0) {
                printWriter.println("  <default>");
            } else {
                for (int i3 = 0; i3 < c; i3++) {
                    printWriter.println("  ".concat(String.valueOf(j.n(i3))));
                }
            }
            printWriter.println();
            int b = j.b();
            if (b > 0) {
                printWriter.println("Blocked Modules:");
                for (int i4 = 0; i4 < b; i4++) {
                    printWriter.println("  ".concat(String.valueOf(j.m(i4))));
                }
                printWriter.println();
            }
            printWriter.println("Modules:");
            int e = j.e();
            ArrayList arrayList = new ArrayList(e);
            for (int i5 = 0; i5 < e; i5++) {
                arrayList.add(j.j(i5));
            }
            Collections.sort(arrayList, prc.b);
            String valueOf = String.valueOf(new File(pqm.e().b, "m").getAbsolutePath());
            String valueOf2 = String.valueOf(File.separator);
            int a = j.a();
            pvn pvnVar = new pvn();
            int i6 = 0;
            int i7 = 0;
            while (i6 < a) {
                j.h(pvnVar, i6);
                StringBuilder sb3 = new StringBuilder(str);
                sb3.append(pvnVar.k());
                sb3.append(" [");
                int i8 = a;
                sb3.append(pvnVar.b());
                sb3.append("] [");
                pvn pvnVar2 = pvnVar;
                String m = pvnVar2.m();
                if (!TextUtils.isEmpty(m)) {
                    sb3.append(m);
                    sb3.append("] [");
                }
                int a2 = psu.a(pvnVar2.a());
                if (a2 == 0) {
                    throw null;
                }
                int i9 = a2 - 1;
                int i10 = i7;
                if (i9 != 1) {
                    str2 = str;
                    if (i9 != 2) {
                        pvpVar = j;
                        if (i9 == 3) {
                            int a3 = pwe.a(pvnVar2.f());
                            int i11 = a3 - 1;
                            if (a3 == 0) {
                                throw null;
                            }
                            if (i11 == 1) {
                                sb3.append("Container");
                            } else if (i11 == 2) {
                                sb3.append("Download");
                            } else if (i11 == 3) {
                                sb3.append("Installed");
                            } else if (i11 != 4) {
                                sb3.append("???");
                            } else {
                                sb3.append("System");
                            }
                            String concat = valueOf.concat(valueOf2);
                            String l = pvnVar2.l();
                            if (l.startsWith(concat)) {
                                l = l.substring(concat.length());
                            }
                            sb3.append(":");
                            sb3.append(l);
                        } else if (i9 != 4) {
                            sb3.append("???");
                        } else {
                            sb3.append("Split");
                        }
                    } else {
                        pvpVar = j;
                        sb3.append("Installed");
                    }
                } else {
                    pvpVar = j;
                    str2 = str;
                    sb3.append("Container");
                }
                sb3.append("]");
                int a4 = psu.a(pvnVar2.a());
                if (a4 == 4 || a4 == 5) {
                    sb3.append(" [");
                    sb3.append(pvnVar2.r());
                    if (pvnVar2.p() != null) {
                        sb3.append(":");
                        sb3.append(pvnVar2.p());
                    }
                    if (pvnVar2.q() != null) {
                        sb3.append(":");
                        sb3.append(pvnVar2.q());
                    }
                    sb3.append("]");
                }
                printWriter.println(sb3);
                int size2 = arrayList.size();
                i7 = i10;
                boolean z = false;
                while (i7 < size2 && ((pvq) arrayList.get(i7)).at() == i6) {
                    pvq pvqVar = (pvq) arrayList.get(i7);
                    StringBuilder sb4 = new StringBuilder("      ");
                    sb4.append(pvqVar.e());
                    sb4.append(" [v");
                    sb4.append(pvqVar.b());
                    sb4.append("]");
                    printWriter.println(sb4);
                    i7++;
                    z = true;
                }
                if (!z) {
                    printWriter.println("      No modules accepted");
                }
                i6++;
                a = i8;
                pvnVar = pvnVar2;
                str = str2;
                j = pvpVar;
            }
            pvp pvpVar2 = j;
            String str3 = str;
            printWriter.println();
            printWriter.println("Features:");
            int d2 = pvpVar2.d();
            eqwk eqwkVar = new eqwk();
            int i12 = 0;
            while (i12 < d2) {
                pvp pvpVar3 = pvpVar2;
                pvpVar3.q(eqwkVar, i12);
                String str4 = str3;
                StringBuilder sb5 = new StringBuilder(str4);
                sb5.append(eqwkVar.ar());
                sb5.append(" [v");
                sb5.append(eqwkVar.x());
                sb5.append("]");
                if (eqwkVar.z()) {
                    sb5.append(" [optional]");
                }
                printWriter.println(sb5.toString());
                i12++;
                pvpVar2 = pvpVar3;
                str3 = str4;
            }
            printWriter.println();
        } catch (InvalidConfigException e2) {
            printWriter.println("Unable to retrieve config: ".concat(e2.toString()));
        }
        printWriter.println("\nModule Set Journal Entries:\n");
        anyf anyfVar = new anyf(dnnr.b(this.f.getApplicationContext()).getSharedPreferences("ChimeraConfigService", 4), true);
        aohx f2 = anyfVar.f();
        Set g = anyfVar.g();
        for (aoib aoibVar : f2.b) {
            String str5 = aoibVar.c;
            printWriter.println(str5 + ":" + aoibVar.d + (true != g.contains(str5) ? "" : ":BLOCKED"));
            printWriter.println("-----");
            printWriter.println(aoie.a(aoibVar));
            printWriter.println();
        }
        printWriter.println("\nmodule_set_list: ".concat(String.valueOf(Base64.encodeToString((byte[]) anyg.d.b(), 2))));
        printWriter.println("required_features: ".concat(String.valueOf(Base64.encodeToString((byte[]) anyg.b.b(), 2))));
        fecj v = pup.a.v();
        v.ad(ppt.d().f());
        printWriter.println("requested_features: ".concat(String.valueOf(Base64.encodeToString(((pup) v.Q()).r(), 2))));
    }

    @Override // defpackage.prc, com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        String str = prc.a.match(uri) != 1 ? null : "vnd.android.cursor.dir/features";
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        int match = d.match(uri);
        if (match == 1 || match == 2) {
            return "vnd.android.cursor.item/api";
        }
        return null;
    }

    @Override // defpackage.prc, com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        eike.e(context);
        this.c = context;
        Context context2 = getContext();
        eike.e(context2);
        this.f = context2;
        this.e = new asrg(context2);
        if (this.g != null) {
            return true;
        }
        this.g = new aodq(context2);
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int match = d.match(uri);
        if (match != 1 && match != 2) {
            return super.openFile(uri, str);
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2 || pathSegments.get(1).isEmpty()) {
            Log.e("GmsModuleProvider", "No configLastModTime in openFile");
            return null;
        }
        try {
            try {
                return pph.f().d(Long.parseLong(pathSegments.get(1)));
            } catch (InvalidConfigException | IOException e) {
                Log.e("GmsModuleProvider", "Failed to get config file descriptor: ".concat(String.valueOf(e.toString())));
                return null;
            }
        } catch (NumberFormatException e2) {
            Log.e("GmsModuleProvider", "Invalid configLastModTime in openFile: ".concat(String.valueOf(e2.toString())));
            return null;
        }
    }

    @Override // defpackage.prc, com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean z;
        int match = d.match(uri);
        if (match == 1) {
            z = false;
        } else {
            if (match != 2) {
                if (prc.a.match(uri) != 1) {
                    Log.e("ModuleProvider", "Unhandled query from " + getCallingPackage() + ": " + String.valueOf(uri));
                    return null;
                }
                pvp b = b();
                if (b == null) {
                    return new MatrixCursor(prb.a, 0);
                }
                int d2 = b.d();
                MatrixCursor matrixCursor = new MatrixCursor(prb.a, d2);
                eqwk eqwkVar = new eqwk();
                for (int i = 0; i < d2; i++) {
                    b.q(eqwkVar, i);
                    matrixCursor.addRow(new Object[]{eqwkVar.ar(), Long.valueOf(eqwkVar.x())});
                }
                return matrixCursor;
            }
            z = true;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2 || pathSegments.get(1).isEmpty()) {
            Log.e("GmsModuleProvider", "No featureName in query.");
            return null;
        }
        StrictMode.ThreadPolicy a = asqw.a();
        try {
            DynamiteModuleData e = aodj.d().e(this.f, this.e, d(uri), pathSegments.get(1), z, true, getCallingPackage());
            if (e != null) {
                eijr eijrVar = bqqe.a;
                bqqa.a(aseu.CHIMERA_DYNAMITE_MODULE_QUERY_RESOLVED);
            }
            return aodj.b(e);
        } finally {
            StrictMode.setThreadPolicy(a);
        }
    }
}
