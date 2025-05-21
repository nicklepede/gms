package com.google.android.gms.auth.managed.services;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserHandle;
import com.google.android.gms.auth.managed.services.UserRestrictionsService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.a;
import defpackage.acaa;
import defpackage.aju$$ExternalSyntheticApiModelOutline0;
import defpackage.asej;
import defpackage.asot;
import defpackage.aspo;
import defpackage.byln;
import defpackage.eihn;
import defpackage.eiig;
import defpackage.eito;
import defpackage.eits;
import defpackage.ejhf;
import defpackage.fkzo;
import j$.util.function.Function$CC;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UserRestrictionsService extends GmsTaskBoundService {
    public static final asot a = asot.b("Auth", asej.AUTH_MANAGED_WORK_PROFILE);
    public static final eits b;
    public boolean c;

    static {
        eito eitoVar = new eito();
        eitoVar.i("dump", new Function() { // from class: abue
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                StringWriter stringWriter = new StringWriter();
                ((UserRestrictionsService) obj).dump(FileDescriptor.out, new aspo(stringWriter, " "), new String[0]);
                ((ejhf) UserRestrictionsService.a.h()).B("%s", stringWriter);
                return 0;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eitoVar.i("fix", new Function() { // from class: abuf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
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
        eitoVar.i("log", new Function() { // from class: abug
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                acaa c = acaa.c((UserRestrictionsService) obj);
                UserHandle myUserHandle = Process.myUserHandle();
                String d = c.d();
                if (d == null) {
                    d = "";
                }
                UserHandle profileParent = c.c.getProfileParent(myUserHandle);
                String num = profileParent != null ? Integer.toString(profileParent.getIdentifier()) : null;
                ((ejhf) acaa.a.h()).T("Logging system restrictions. user=%s parent=%s packageName=%s", myUserHandle, profileParent, d);
                PersistableBundle b2 = c.b(myUserHandle);
                for (String str : b2.keySet()) {
                    boolean equals = str.equals(num);
                    PersistableBundle persistableBundle = b2.getPersistableBundle(str);
                    if (persistableBundle == null) {
                        persistableBundle = new PersistableBundle();
                    }
                    for (String str2 : persistableBundle.keySet()) {
                        int i = persistableBundle.getInt(str2);
                        abzu abzuVar = c.d;
                        fecj v = fwbz.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        fwbz fwbzVar = (fwbz) fecpVar;
                        str2.getClass();
                        fwbzVar.b |= 1;
                        fwbzVar.c = str2;
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        fecp fecpVar2 = v.b;
                        fwbz fwbzVar2 = (fwbz) fecpVar2;
                        fwbzVar2.b |= 2;
                        fwbzVar2.d = i;
                        if (!fecpVar2.L()) {
                            v.U();
                        }
                        fwbz fwbzVar3 = (fwbz) v.b;
                        fwbzVar3.b |= 4;
                        fwbzVar3.e = equals;
                        fwbz fwbzVar4 = (fwbz) v.Q();
                        fecj v2 = fwca.a.v();
                        fwbs b3 = abzu.b();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fecp fecpVar3 = v2.b;
                        fwca fwcaVar = (fwca) fecpVar3;
                        b3.getClass();
                        fwcaVar.c = b3;
                        fwcaVar.b |= 1;
                        if (!fecpVar3.L()) {
                            v2.U();
                        }
                        fecp fecpVar4 = v2.b;
                        fwca fwcaVar2 = (fwca) fecpVar4;
                        fwcaVar2.d = 29;
                        fwcaVar2.b |= 2;
                        if (!fecpVar4.L()) {
                            v2.U();
                        }
                        fecp fecpVar5 = v2.b;
                        fwca fwcaVar3 = (fwca) fecpVar5;
                        fwcaVar3.b |= 16;
                        fwcaVar3.g = d;
                        if (!fecpVar5.L()) {
                            v2.U();
                        }
                        fwca fwcaVar4 = (fwca) v2.b;
                        fwbzVar4.getClass();
                        fwcaVar4.l = fwbzVar4;
                        fwcaVar4.b |= 1024;
                        abzuVar.n((fwca) v2.Q(), abzuVar.a, 30);
                    }
                }
                return 0;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eitoVar.i("record", new Function() { // from class: abuh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                UserRestrictionsService userRestrictionsService = (UserRestrictionsService) obj;
                if (!userRestrictionsService.c) {
                    return 2;
                }
                try {
                    acaa c = acaa.c(userRestrictionsService);
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
                    ((ejhf) ((ejhf) UserRestrictionsService.a.i()).s(e)).x("Failed to record restriction task.");
                    return 2;
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eitoVar.i("debug", new Function() { // from class: abui
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ((ejhf) UserRestrictionsService.a.h()).x("Running no op task...");
                return 0;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b = eitoVar.b();
    }

    private final void d(PersistableBundle persistableBundle, aspo aspoVar) {
        aspoVar.b();
        aspoVar.println("[PersistableBundle] size=" + persistableBundle.size());
        aspoVar.b();
        for (String str : persistableBundle.keySet()) {
            Object obj = persistableBundle.get(str);
            if (obj instanceof PersistableBundle) {
                aspoVar.print(String.valueOf(str).concat(": "));
                d((PersistableBundle) obj, aspoVar);
            } else {
                aspoVar.println(a.ak(obj, str, ": "));
            }
        }
        aspoVar.a();
        aspoVar.a();
    }

    private final void e(String str, aspo aspoVar) {
        PersistableBundle readFromStream;
        aspoVar.b();
        try {
            try {
                asot asotVar = acaa.a;
                FileInputStream openFileInput = openFileInput(str);
                try {
                    readFromStream = PersistableBundle.readFromStream(openFileInput);
                    if (openFileInput != null) {
                        openFileInput.close();
                    }
                    d(readFromStream, aspoVar);
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
                aspoVar.println("null");
            }
        } finally {
            aspoVar.a();
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        Object apply;
        asot asotVar = a;
        ((ejhf) asotVar.h()).x("onRunTask");
        if (!fkzo.e() || acaa.c(this).d() == null) {
            ((ejhf) asotVar.h()).x("User restriction task was disabled after scheduling. Canceling.");
            return 2;
        }
        String str = bylnVar.a;
        eits eitsVar = b;
        if (!eitsVar.containsKey(str)) {
            ((ejhf) asotVar.i()).B("Unexpected tag: %s.", bylnVar.a);
            return 2;
        }
        if (eihn.a(str, "debug")) {
            Bundle bundle = bylnVar.b;
            ((ejhf) asotVar.h()).B("Extras = %s", bundle);
            boolean z = false;
            if (bundle != null && bundle.getBoolean("enable_debug", false)) {
                z = true;
            }
            this.c = z;
        }
        ((ejhf) asotVar.h()).Q("Running user restriction %s task, isDebugEnabled = %b", str, this.c);
        try {
            Function m98m = aju$$ExternalSyntheticApiModelOutline0.m98m(eitsVar.get(str));
            eiig.x(m98m);
            apply = m98m.apply(this);
            return ((Integer) apply).intValue();
        } catch (RuntimeException e) {
            ((ejhf) ((ejhf) a.i()).s(e)).B("Failed to run user restriction %s task.", bylnVar.a);
            return 2;
        }
    }

    @Override // com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aspo aspoVar = new aspo(printWriter, " ");
        aspoVar.println("UserRestrictionsService user=".concat(String.valueOf(String.valueOf(Process.myUserHandle()))));
        aspoVar.b();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            aspoVar.println("Current Restrictions");
            d(acaa.c(this).b(Process.myUserHandle()), aspoVar);
            aspoVar.println("Recorded Restrictions");
            e("user_restrictions_recorded", aspoVar);
            aspoVar.println("Fixed Restrictions");
            e("user_restrictions_fixed", aspoVar);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            aspoVar.flush();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
