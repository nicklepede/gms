package com.google.android.gms.auth.managed.services;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserHandle;
import com.google.android.gms.auth.managed.services.UserRestrictionsService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.a;
import defpackage.aeaa;
import defpackage.akd$$ExternalSyntheticApiModelOutline0;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auti;
import defpackage.cauf;
import defpackage.ekus;
import defpackage.ekvl;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.eluo;
import defpackage.fnqw;
import j$.util.function.Function$CC;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UserRestrictionsService extends GmsTaskBoundService {
    public static final ausn a = ausn.b("Auth", auid.AUTH_MANAGED_WORK_PROFILE);
    public static final elgx b;
    public boolean c;

    static {
        elgt elgtVar = new elgt();
        elgtVar.i("dump", new Function() { // from class: adue
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo479andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                StringWriter stringWriter = new StringWriter();
                ((UserRestrictionsService) obj).dump(FileDescriptor.out, new auti(stringWriter, " "), new String[0]);
                ((eluo) UserRestrictionsService.a.h()).B("%s", stringWriter);
                return 0;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        elgtVar.i("fix", new Function() { // from class: aduf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo479andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return 2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        elgtVar.i("log", new Function() { // from class: adug
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo479andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aeaa c = aeaa.c((UserRestrictionsService) obj);
                UserHandle myUserHandle = Process.myUserHandle();
                String d = c.d();
                if (d == null) {
                    d = "";
                }
                UserHandle profileParent = c.c.getProfileParent(myUserHandle);
                String num = profileParent != null ? Integer.toString(profileParent.getIdentifier()) : null;
                ((eluo) aeaa.a.h()).T("Logging system restrictions. user=%s parent=%s packageName=%s", myUserHandle, profileParent, d);
                PersistableBundle b2 = c.b(myUserHandle);
                for (String str : b2.keySet()) {
                    boolean equals = str.equals(num);
                    PersistableBundle persistableBundle = b2.getPersistableBundle(str);
                    if (persistableBundle == null) {
                        persistableBundle = new PersistableBundle();
                    }
                    for (String str2 : persistableBundle.keySet()) {
                        int i = persistableBundle.getInt(str2);
                        adzu adzuVar = c.d;
                        fgrc v = fyyb.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        fyyb fyybVar = (fyyb) fgriVar;
                        str2.getClass();
                        fyybVar.b |= 1;
                        fyybVar.c = str2;
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        fgri fgriVar2 = v.b;
                        fyyb fyybVar2 = (fyyb) fgriVar2;
                        fyybVar2.b |= 2;
                        fyybVar2.d = i;
                        if (!fgriVar2.L()) {
                            v.U();
                        }
                        fyyb fyybVar3 = (fyyb) v.b;
                        fyybVar3.b |= 4;
                        fyybVar3.e = equals;
                        fyyb fyybVar4 = (fyyb) v.Q();
                        fgrc v2 = fyyc.a.v();
                        fyxu b3 = adzu.b();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fgri fgriVar3 = v2.b;
                        fyyc fyycVar = (fyyc) fgriVar3;
                        b3.getClass();
                        fyycVar.c = b3;
                        fyycVar.b |= 1;
                        if (!fgriVar3.L()) {
                            v2.U();
                        }
                        fgri fgriVar4 = v2.b;
                        fyyc fyycVar2 = (fyyc) fgriVar4;
                        fyycVar2.d = 29;
                        fyycVar2.b |= 2;
                        if (!fgriVar4.L()) {
                            v2.U();
                        }
                        fgri fgriVar5 = v2.b;
                        fyyc fyycVar3 = (fyyc) fgriVar5;
                        fyycVar3.b |= 16;
                        fyycVar3.g = d;
                        if (!fgriVar5.L()) {
                            v2.U();
                        }
                        fyyc fyycVar4 = (fyyc) v2.b;
                        fyybVar4.getClass();
                        fyycVar4.l = fyybVar4;
                        fyycVar4.b |= 1024;
                        adzuVar.n((fyyc) v2.Q(), adzuVar.a, 30);
                    }
                }
                return 0;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        elgtVar.i("record", new Function() { // from class: aduh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo479andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                UserRestrictionsService userRestrictionsService = (UserRestrictionsService) obj;
                if (!userRestrictionsService.c) {
                    return 2;
                }
                try {
                    aeaa c = aeaa.c(userRestrictionsService);
                    PersistableBundle b2 = c.b(Process.myUserHandle());
                    FileOutputStream openFileOutput = c.b.openFileOutput("user_restrictions_recorded", 0);
                    try {
                        b2.writeToStream(openFileOutput);
                        if (openFileOutput != null) {
                            openFileOutput.close();
                        }
                        return 0;
                    } finally {
                    }
                } catch (IOException | RuntimeException e) {
                    ((eluo) ((eluo) UserRestrictionsService.a.i()).s(e)).x("Failed to record restriction task.");
                    return 2;
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        elgtVar.i("debug", new Function() { // from class: adui
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo479andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ((eluo) UserRestrictionsService.a.h()).x("Running no op task...");
                return 0;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b = elgtVar.b();
    }

    private final void d(PersistableBundle persistableBundle, auti autiVar) {
        autiVar.b();
        autiVar.println("[PersistableBundle] size=" + persistableBundle.size());
        autiVar.b();
        for (String str : persistableBundle.keySet()) {
            Object obj = persistableBundle.get(str);
            if (obj instanceof PersistableBundle) {
                autiVar.print(String.valueOf(str).concat(": "));
                d((PersistableBundle) obj, autiVar);
            } else {
                autiVar.println(a.D(obj, str, ": "));
            }
        }
        autiVar.a();
        autiVar.a();
    }

    private final void e(String str, auti autiVar) {
        PersistableBundle readFromStream;
        autiVar.b();
        try {
            try {
                ausn ausnVar = aeaa.a;
                FileInputStream openFileInput = openFileInput(str);
                try {
                    readFromStream = PersistableBundle.readFromStream(openFileInput);
                    if (openFileInput != null) {
                        openFileInput.close();
                    }
                    d(readFromStream, autiVar);
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused) {
                autiVar.println("null");
            }
        } finally {
            autiVar.a();
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        Object apply;
        ausn ausnVar = a;
        ((eluo) ausnVar.h()).x("onRunTask");
        if (!fnqw.e() || aeaa.c(this).d() == null) {
            ((eluo) ausnVar.h()).x("User restriction task was disabled after scheduling. Canceling.");
            return 2;
        }
        String str = caufVar.a;
        elgx elgxVar = b;
        if (!elgxVar.containsKey(str)) {
            ((eluo) ausnVar.i()).B("Unexpected tag: %s.", caufVar.a);
            return 2;
        }
        if (ekus.a(str, "debug")) {
            Bundle bundle = caufVar.b;
            ((eluo) ausnVar.h()).B("Extras = %s", bundle);
            boolean z = false;
            if (bundle != null && bundle.getBoolean("enable_debug", false)) {
                z = true;
            }
            this.c = z;
        }
        ((eluo) ausnVar.h()).Q("Running user restriction %s task, isDebugEnabled = %b", str, this.c);
        try {
            Function m113m = akd$$ExternalSyntheticApiModelOutline0.m113m(elgxVar.get(str));
            ekvl.y(m113m);
            apply = m113m.apply(this);
            return ((Integer) apply).intValue();
        } catch (RuntimeException e) {
            ((eluo) ((eluo) a.i()).s(e)).B("Failed to run user restriction %s task.", caufVar.a);
            return 2;
        }
    }

    @Override // com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        auti autiVar = new auti(printWriter, " ");
        autiVar.println("UserRestrictionsService user=".concat(String.valueOf(String.valueOf(Process.myUserHandle()))));
        autiVar.b();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            autiVar.println("Current Restrictions");
            d(aeaa.c(this).b(Process.myUserHandle()), autiVar);
            autiVar.println("Recorded Restrictions");
            e("user_restrictions_recorded", autiVar);
            autiVar.println("Fixed Restrictions");
            e("user_restrictions_fixed", autiVar);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            autiVar.flush();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
