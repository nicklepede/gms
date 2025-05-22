package com.google.android.gms.wearable.bugreport.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.wearable.bugreport.ui.BugreportConsentChimeraActivity;
import defpackage.aupz;
import defpackage.dmkw;
import defpackage.dmlg;
import defpackage.dmlk;
import defpackage.dmln;
import defpackage.dmlr;
import defpackage.dmma;
import defpackage.dmmb;
import defpackage.dmmf;
import defpackage.domr;
import defpackage.ekvl;
import defpackage.fwby;
import defpackage.iq;
import defpackage.jxw;
import defpackage.ryt;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class BugreportConsentChimeraActivity extends ryt {
    dmlg j;
    private dmma k;

    private final void h() {
        final dmlr b = b(false);
        if (b != null) {
            runOnUiThread(new Runnable() { // from class: dmkz
                @Override // java.lang.Runnable
                public final void run() {
                    dmlr.this.dismiss();
                }
            });
        }
    }

    public final dmlk a(boolean z) {
        dmlk dmlkVar = (dmlk) getSupportFragmentManager().h("BugreportConsentDialogFragment");
        return (z && dmlkVar == null) ? new dmlk() : dmlkVar;
    }

    public final dmlr b(boolean z) {
        dmlr dmlrVar = (dmlr) getSupportFragmentManager().h("RetryDialogFragment");
        if (!z || dmlrVar != null) {
            return dmlrVar;
        }
        dmlr dmlrVar2 = new dmlr();
        dmmb dmmbVar = new dmmb() { // from class: dmku
            @Override // defpackage.dmmb
            public final void a() {
                BugreportConsentChimeraActivity bugreportConsentChimeraActivity = BugreportConsentChimeraActivity.this;
                bugreportConsentChimeraActivity.f();
                bugreportConsentChimeraActivity.g(true);
            }
        };
        dmmb dmmbVar2 = new dmmb() { // from class: dmkx
            @Override // defpackage.dmmb
            public final void a() {
                if (Log.isLoggable("BugreportConsent", 3)) {
                    Log.d("BugreportConsent", "cancel");
                }
                BugreportConsentChimeraActivity bugreportConsentChimeraActivity = BugreportConsentChimeraActivity.this;
                bugreportConsentChimeraActivity.setResult(2);
                bugreportConsentChimeraActivity.c();
                bugreportConsentChimeraActivity.finish();
            }
        };
        dmlrVar2.ag = Optional.of(dmmbVar);
        dmlrVar2.ah = Optional.of(dmmbVar2);
        return dmlrVar2;
    }

    public final void c() {
        final dmlk dmlkVar = (dmlk) getSupportFragmentManager().h("BugreportConsentDialogFragment");
        if (dmlkVar != null) {
            runOnUiThread(new Runnable() { // from class: dmlb
                @Override // java.lang.Runnable
                public final void run() {
                    dmlk dmlkVar2 = dmlk.this;
                    dmlkVar2.x();
                    dmlkVar2.dismiss();
                }
            });
        }
        h();
    }

    public final void f() {
        h();
        dmlk a = a(true);
        ekvl.y(a);
        if (!a.isAdded()) {
            a.show(getSupportFragmentManager(), "BugreportConsentDialogFragment");
            return;
        }
        Dialog dialog = a.getDialog();
        if (dialog != null) {
            dialog.show();
        }
    }

    public final void g(final boolean z) {
        final dmlk a = a(false);
        if (a != null) {
            Log.d("BugreportConsent", "showSnackbar");
            iq iqVar = (iq) a.getDialog();
            if (iqVar == null) {
                return;
            }
            final int i = z ? R.string.wearable_bugreport_connecting_status : R.string.wearable_bugreport_connected_status;
            final ViewGroup viewGroup = (ViewGroup) iqVar.findViewById(android.R.id.content);
            if (viewGroup != null) {
                final dmmf dmmfVar = a.ah;
                final Context requireContext = a.requireContext();
                final dmmb dmmbVar = new dmmb() { // from class: dmlh
                    @Override // defpackage.dmmb
                    public final void a() {
                        Log.d("BugreportConsent", "onCancel");
                        dmlk dmlkVar = dmlk.this;
                        iq iqVar2 = (iq) dmlkVar.getDialog();
                        if (iqVar2 == null) {
                            return;
                        }
                        dmlkVar.ag.h.a().b.ifPresent(new Consumer() { // from class: dmkp
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void u(Object obj) {
                                ((eqgl) obj).cancel(false);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        dmlkVar.ag.onClick(iqVar2, -2);
                    }
                };
                if (dmmfVar.a.isPresent()) {
                    Log.d("SnackbarHandlerProvider", "showSnackbar: ignore since already shown");
                } else {
                    dmmfVar.c.postDelayed(new Runnable() { // from class: dmmd
                        @Override // java.lang.Runnable
                        public final void run() {
                            Optional of = Optional.of(LayoutInflater.from(requireContext).inflate(R.layout.wearable_bugreport_consent_snackbar, (ViewGroup) null));
                            dmmf dmmfVar2 = dmmf.this;
                            dmmfVar2.b = of;
                            Log.d("SnackbarHandlerProvider", "showSnackbar ");
                            Object obj = dmmfVar2.b.get();
                            ViewGroup viewGroup2 = viewGroup;
                            dmmfVar2.a = Optional.of(new eels(viewGroup2.getContext(), viewGroup2, (View) obj, dmmfVar2));
                            ((eels) dmmfVar2.a.get()).l = -2;
                            ((eels) dmmfVar2.a.get()).i();
                            if (!z) {
                                Object obj2 = dmmfVar2.a.get();
                                if (Log.isLoggable("BugreportConsentSnackb", 3)) {
                                    Log.d("BugreportConsentSnackb", "stopProgress");
                                }
                                eelr eelrVar = ((eels) obj2).j;
                                eelrVar.findViewById(R.id.progress_circular).setVisibility(8);
                                eelrVar.findViewById(R.id.check_image).setVisibility(0);
                                eelrVar.findViewById(R.id.connecting_text).setVisibility(8);
                                eelrVar.findViewById(R.id.connected_text).setVisibility(0);
                                eelrVar.findViewById(R.id.cancel_image).setVisibility(8);
                                return;
                            }
                            Object obj3 = dmmfVar2.a.get();
                            if (Log.isLoggable("BugreportConsentSnackb", 3)) {
                                Log.d("BugreportConsentSnackb", "showProgress");
                            }
                            final dmmb dmmbVar2 = dmmbVar;
                            int i2 = i;
                            eelr eelrVar2 = ((eels) obj3).j;
                            eelrVar2.findViewById(R.id.progress_circular).setVisibility(0);
                            eelrVar2.findViewById(R.id.check_image).setVisibility(8);
                            TextView textView = (TextView) eelrVar2.findViewById(R.id.connecting_text);
                            textView.setText(i2);
                            textView.setVisibility(0);
                            View findViewById = eelrVar2.findViewById(R.id.cancel_image);
                            findViewById.setVisibility(0);
                            findViewById.setOnClickListener(new View.OnClickListener() { // from class: dmls
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    String str = eels.b;
                                    dmmb.this.a();
                                }
                            });
                            eelrVar2.findViewById(R.id.connected_text).setVisibility(8);
                        }
                    }, 500L);
                }
            }
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fwby.c()) {
            Log.w("BugreportConsent", "Activity invoked but feature is disabled.");
            setResult(1);
            finish();
            return;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            Log.w("BugreportConsent", "Calling package is null");
        } else if (new domr(this).c(callingPackage)) {
            Intent intent = getIntent();
            if (Log.isLoggable("BugreportConsent", 4)) {
                Log.i("BugreportConsent", "Starting activity");
                if (Log.isLoggable("BugreportConsent", 3)) {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        Log.d("BugreportConsent", "Extras: null\n");
                    } else {
                        Log.d("BugreportConsent", "Extras:\n");
                        for (String str : extras.keySet()) {
                            Log.d("BugreportConsent", String.format("%s: %s", str, extras.get(str)));
                        }
                    }
                }
            }
            dmma dmmaVar = new dmma(intent);
            this.k = dmmaVar;
            if (!((Boolean) dmmaVar.a.map(new Function() { // from class: dmly
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo479andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(!((String) obj).isEmpty());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(false)).booleanValue() || !((Boolean) this.k.b.map(new Function() { // from class: dmlx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo479andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(!((String) obj).isEmpty());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(false)).booleanValue()) {
                Log.w("BugreportConsent", "Device name or OEM is empty");
                setResult(1);
                finish();
                return;
            }
            if (!((Boolean) this.k.c.map(new Function() { // from class: dmlz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo479andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(!((String) obj).isEmpty());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(false)).booleanValue()) {
                Log.w("BugreportConsent", "Peer id is empty");
                setResult(1);
                finish();
                return;
            }
            if (this.j == null) {
                this.j = new dmlg(this, new aupz(1, 9));
            }
            if (Log.isLoggable("BugreportConsent", 3)) {
                Log.d("BugreportConsent", "BugreportConsentDialogViewModel: initialize");
            }
            dmln dmlnVar = (dmln) new jxw(this).a(dmln.class);
            dmma dmmaVar2 = this.k;
            dmmb dmmbVar = new dmmb() { // from class: dmlc
                @Override // defpackage.dmmb
                public final void a() {
                    if (Log.isLoggable("BugreportConsent", 3)) {
                        Log.d("BugreportConsent", "onAllowButtonClicked");
                    }
                    BugreportConsentChimeraActivity.this.g(true);
                }
            };
            dmmb dmmbVar2 = new dmmb() { // from class: dmld
                @Override // defpackage.dmmb
                public final void a() {
                    if (Log.isLoggable("BugreportConsent", 3)) {
                        Log.d("BugreportConsent", "deny");
                    }
                    BugreportConsentChimeraActivity bugreportConsentChimeraActivity = BugreportConsentChimeraActivity.this;
                    bugreportConsentChimeraActivity.setResult(-1);
                    bugreportConsentChimeraActivity.c();
                    bugreportConsentChimeraActivity.finish();
                }
            };
            dmmb dmmbVar3 = new dmmb() { // from class: dmle
                @Override // defpackage.dmmb
                public final void a() {
                    if (Log.isLoggable("BugreportConsent", 3)) {
                        Log.d("BugreportConsent", "onSendingToWear");
                    }
                    BugreportConsentChimeraActivity.this.f();
                }
            };
            dmmb dmmbVar4 = new dmmb() { // from class: dmlf
                @Override // defpackage.dmmb
                public final void a() {
                    if (Log.isLoggable("BugreportConsent", 3)) {
                        Log.d("BugreportConsent", "onConsentFlowCompleted");
                    }
                    BugreportConsentChimeraActivity bugreportConsentChimeraActivity = BugreportConsentChimeraActivity.this;
                    bugreportConsentChimeraActivity.g(false);
                    bugreportConsentChimeraActivity.c();
                    bugreportConsentChimeraActivity.setResult(-1);
                    bugreportConsentChimeraActivity.finish();
                }
            };
            dmmb dmmbVar5 = new dmmb() { // from class: dmkv
                @Override // defpackage.dmmb
                public final void a() {
                    if (Log.isLoggable("BugreportConsent", 3)) {
                        Log.d("BugreportConsent", "on consent flow failed");
                    }
                    final BugreportConsentChimeraActivity bugreportConsentChimeraActivity = BugreportConsentChimeraActivity.this;
                    bugreportConsentChimeraActivity.runOnUiThread(new Runnable() { // from class: dmla
                        @Override // java.lang.Runnable
                        public final void run() {
                            Dialog dialog;
                            BugreportConsentChimeraActivity bugreportConsentChimeraActivity2 = BugreportConsentChimeraActivity.this;
                            dmlk a = bugreportConsentChimeraActivity2.a(false);
                            if (a != null) {
                                a.x();
                            }
                            if (Log.isLoggable("BugreportConsent", 3)) {
                                Log.d("BugreportConsent", "showRetryDialog");
                            }
                            dmlk a2 = bugreportConsentChimeraActivity2.a(false);
                            if (a2 != null && a2.isAdded() && (dialog = a2.getDialog()) != null) {
                                dialog.hide();
                            }
                            dmlr b = bugreportConsentChimeraActivity2.b(true);
                            if (b != null) {
                                b.show(bugreportConsentChimeraActivity2.getSupportFragmentManager(), "RetryDialogFragment");
                            }
                        }
                    });
                }
            };
            int callingUid = Binder.getCallingUid();
            PackageManager packageManager = getPackageManager();
            String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
            String str2 = "bugreport";
            if (packagesForUid != null && packagesForUid.length != 0) {
                String str3 = packagesForUid[0];
                try {
                    str2 = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(str3, 0));
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("BugreportConsent", "Failed to get application name for package: ".concat(String.valueOf(str3)), e);
                }
            }
            dmlg dmlgVar = this.j;
            dmlnVar.g = dmmaVar2;
            dmlnVar.b = dmmbVar;
            dmlnVar.c = dmmbVar2;
            dmlnVar.d = dmmbVar3;
            dmlnVar.e = dmmbVar4;
            dmlnVar.f = dmmbVar5;
            dmlnVar.a = str2;
            dmlnVar.h = dmlgVar;
            final dmkw dmkwVar = new dmkw(this);
            new aupz(1, 9).execute(new Runnable() { // from class: dmkt
                @Override // java.lang.Runnable
                public final void run() {
                    final boolean z = !auqx.x(this).isEmpty();
                    final BugreportConsentChimeraActivity bugreportConsentChimeraActivity = dmkwVar.a;
                    bugreportConsentChimeraActivity.runOnUiThread(new Runnable() { // from class: dmky
                        @Override // java.lang.Runnable
                        public final void run() {
                            BugreportConsentChimeraActivity bugreportConsentChimeraActivity2 = BugreportConsentChimeraActivity.this;
                            if (z) {
                                Log.i("BugreportConsent", "Supervised account found on the device.");
                                Toast.makeText(bugreportConsentChimeraActivity2, bugreportConsentChimeraActivity2.getString(R.string.wearable_bugreport_supervised_account_toast), 1).show();
                                bugreportConsentChimeraActivity2.setResult(1);
                                bugreportConsentChimeraActivity2.finish();
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 30 && bugreportConsentChimeraActivity2.getWindow() != null) {
                                bugreportConsentChimeraActivity2.getContainerActivity().setTranslucent(true);
                                bugreportConsentChimeraActivity2.getWindow().setBackgroundDrawable(new ColorDrawable(bugreportConsentChimeraActivity2.getResources().getColor(R.color.wearable_bugreport_consent_background)));
                            }
                            bugreportConsentChimeraActivity2.f();
                        }
                    });
                }
            });
            return;
        }
        Log.w("BugreportConsent", "Activity invoked but not from OEM companion app.");
        setResult(1);
        finish();
    }
}
