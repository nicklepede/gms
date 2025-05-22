package com.google.android.gms.backup.base;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.BackupAgent;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import defpackage.ajin;
import defpackage.ajio;
import defpackage.ajmo;
import defpackage.ajwt;
import defpackage.btco;
import defpackage.elgx;
import defpackage.foeo;
import defpackage.fpmr;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import java.io.File;
import java.util.LinkedHashMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsBackupAgent extends BackupAgent {
    public static final /* synthetic */ int a = 0;
    private static final ajwt b = new ajwt("GmsBackupAgent");
    private elgx c;
    private ajmo d;

    private final elgx a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(this).getAllModulesWithMetadata("ChimeraModuleBackupAgent")) {
                String str = moduleInfo.moduleId;
                if (f(str)) {
                    String string = moduleInfo.getMetadata(this).getString("ChimeraModuleBackupAgent");
                    if (string == null) {
                        b.f("Empty backup agent metadata in module %s", str);
                    } else {
                        linkedHashMap.put(str, string);
                        b.j("Found action %s in module %s", string, str);
                    }
                } else {
                    b.m("Module %s wants to back up, but is not whitelisted, skipping.", str);
                }
            }
        } catch (InvalidConfigException e) {
            b.g("Failed to load module configuration", e, new Object[0]);
        }
        return elgx.k(linkedHashMap);
    }

    private final File b(String str) {
        return d(getFilesDir(), String.valueOf(str).concat(".oldState"));
    }

    private final File c(String str) {
        return d(getCacheDir(), String.valueOf(str).concat(".restore.data"));
    }

    private static final File d(File file, String str) {
        return fpmr.i() ? new File(btco.a.b(file, str)) : new File(file, str);
    }

    private static final boolean e() {
        return ((long) Build.VERSION.SDK_INT) >= foeo.a.lK().c();
    }

    private static final boolean f(String str) {
        return foeo.a.lK().h().contains(str);
    }

    private static final ParcelFileDescriptor g(File file) {
        return ParcelFileDescriptor.open(file, 402653184);
    }

    private static final ParcelFileDescriptor h(File file) {
        return ParcelFileDescriptor.open(file, 1006632960);
    }

    private static final void i(String str, File file, ParcelFileDescriptor parcelFileDescriptor) {
        if (file.length() == 0) {
            return;
        }
        ajin.b(ajio.a(str, (int) file.length(), Files.readAllBytes(FileRetargetClass.toPath(file))), parcelFileDescriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141 A[Catch: all -> 0x017c, TryCatch #19 {all -> 0x017c, blocks: (B:118:0x011b, B:38:0x0129, B:39:0x013b, B:41:0x0141, B:43:0x0156, B:126:0x0107, B:128:0x0111, B:129:0x0114), top: B:117:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.chimera.BackupAgent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBackup(android.os.ParcelFileDescriptor r22, android.app.backup.BackupDataOutput r23, android.os.ParcelFileDescriptor r24) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.base.GmsBackupAgent.onBackup(android.os.ParcelFileDescriptor, android.app.backup.BackupDataOutput, android.os.ParcelFileDescriptor):void");
    }

    @Override // com.google.android.chimera.BackupAgent
    public final void onCreate() {
        super.onCreate();
        foeo.a.lK().o();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x034a  */
    @Override // com.google.android.chimera.BackupAgent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRestore(android.app.backup.BackupDataInput r13, int r14, android.os.ParcelFileDescriptor r15) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.base.GmsBackupAgent.onRestore(android.app.backup.BackupDataInput, int, android.os.ParcelFileDescriptor):void");
    }
}
