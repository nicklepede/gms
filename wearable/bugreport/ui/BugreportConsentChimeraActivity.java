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
import defpackage.asmf;
import defpackage.djzd;
import defpackage.djzn;
import defpackage.djzr;
import defpackage.djzu;
import defpackage.djzy;
import defpackage.dkah;
import defpackage.dkai;
import defpackage.dkam;
import defpackage.dmbf;
import defpackage.eiig;
import defpackage.ftgj;
import defpackage.iq;
import defpackage.jrh;
import defpackage.qfp;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class BugreportConsentChimeraActivity extends qfp {
    djzn j;
    private dkah k;

    private final void h() {
        final djzy b = b(false);
        if (b != null) {
            runOnUiThread(new Runnable() { // from class: djzg
                @Override // java.lang.Runnable
                public final void run() {
                    djzy.this.dismiss();
                }
            });
        }
    }

    public final djzr a(boolean z) {
        djzr djzrVar = (djzr) getSupportFragmentManager().h("BugreportConsentDialogFragment");
        return (z && djzrVar == null) ? new djzr() : djzrVar;
    }

    public final djzy b(boolean z) {
        djzy djzyVar = (djzy) getSupportFragmentManager().h("RetryDialogFragment");
        if (!z || djzyVar != null) {
            return djzyVar;
        }
        djzy djzyVar2 = new djzy();
        dkai dkaiVar = new dkai() { // from class: djzb
            @Override // defpackage.dkai
            public final void a() {
                BugreportConsentChimeraActivity bugreportConsentChimeraActivity = BugreportConsentChimeraActivity.this;
                bugreportConsentChimeraActivity.f();
                bugreportConsentChimeraActivity.g(true);
            }
        };
        dkai dkaiVar2 = new dkai() { // from class: djze
            @Override // defpackage.dkai
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
        djzyVar2.ag = Optional.of(dkaiVar);
        djzyVar2.ah = Optional.of(dkaiVar2);
        return djzyVar2;
    }

    public final void c() {
        final djzr djzrVar = (djzr) getSupportFragmentManager().h("BugreportConsentDialogFragment");
        if (djzrVar != null) {
            runOnUiThread(new Runnable() { // from class: djzi
                @Override // java.lang.Runnable
                public final void run() {
                    djzr djzrVar2 = djzr.this;
                    djzrVar2.x();
                    djzrVar2.dismiss();
                }
            });
        }
        h();
    }

    public final void f() {
        h();
        djzr a = a(true);
        eiig.x(a);
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
        final djzr a = a(false);
        if (a != null) {
            Log.d("BugreportConsent", "showSnackbar");
            iq iqVar = (iq) a.getDialog();
            if (iqVar == null) {
                return;
            }
            final int i = z ? R.string.wearable_bugreport_connecting_status : R.string.wearable_bugreport_connected_status;
            final ViewGroup viewGroup = (ViewGroup) iqVar.findViewById(android.R.id.content);
            if (viewGroup != null) {
                final dkam dkamVar = a.ah;
                final Context requireContext = a.requireContext();
                final dkai dkaiVar = new dkai() { // from class: djzo
                    @Override // defpackage.dkai
                    public final void a() {
                        Log.d("BugreportConsent", "onCancel");
                        djzr djzrVar = djzr.this;
                        iq iqVar2 = (iq) djzrVar.getDialog();
                        if (iqVar2 == null) {
                            return;
                        }
                        djzrVar.ag.h.a().b.ifPresent(new Consumer() { // from class: djyw
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void q(Object obj) {
                                ((enss) obj).cancel(false);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        djzrVar.ag.onClick(iqVar2, -2);
                    }
                };
                if (dkamVar.a.isPresent()) {
                    Log.d("SnackbarHandlerProvider", "showSnackbar: ignore since already shown");
                } else {
                    dkamVar.c.postDelayed(new Runnable() { // from class: dkak
                        @Override // java.lang.Runnable
                        public final void run() {
                            Optional of = Optional.of(LayoutInflater.from(requireContext).inflate(R.layout.wearable_bugreport_consent_snackbar, (ViewGroup) null));
                            dkam dkamVar2 = dkam.this;
                            dkamVar2.b = of;
                            Log.d("SnackbarHandlerProvider", "showSnackbar ");
                            Object obj = dkamVar2.b.get();
                            ViewGroup viewGroup2 = viewGroup;
                            dkamVar2.a = Optional.of(new ebzd(viewGroup2.getContext(), viewGroup2, (View) obj, dkamVar2));
                            ((ebzd) dkamVar2.a.get()).l = -2;
                            ((ebzd) dkamVar2.a.get()).i();
                            if (!z) {
                                Object obj2 = dkamVar2.a.get();
                                if (Log.isLoggable("BugreportConsentSnackb", 3)) {
                                    Log.d("BugreportConsentSnackb", "stopProgress");
                                }
                                ebzc ebzcVar = ((ebzd) obj2).j;
                                ebzcVar.findViewById(R.id.progress_circular).setVisibility(8);
                                ebzcVar.findViewById(R.id.check_image).setVisibility(0);
                                ebzcVar.findViewById(R.id.connecting_text).setVisibility(8);
                                ebzcVar.findViewById(R.id.connected_text).setVisibility(0);
                                ebzcVar.findViewById(R.id.cancel_image).setVisibility(8);
                                return;
                            }
                            Object obj3 = dkamVar2.a.get();
                            if (Log.isLoggable("BugreportConsentSnackb", 3)) {
                                Log.d("BugreportConsentSnackb", "showProgress");
                            }
                            final dkai dkaiVar2 = dkaiVar;
                            int i2 = i;
                            ebzc ebzcVar2 = ((ebzd) obj3).j;
                            ebzcVar2.findViewById(R.id.progress_circular).setVisibility(0);
                            ebzcVar2.findViewById(R.id.check_image).setVisibility(8);
                            TextView textView = (TextView) ebzcVar2.findViewById(R.id.connecting_text);
                            textView.setText(i2);
                            textView.setVisibility(0);
                            View findViewById = ebzcVar2.findViewById(R.id.cancel_image);
                            findViewById.setVisibility(0);
                            findViewById.setOnClickListener(new View.OnClickListener() { // from class: djzz
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    String str = ebzd.b;
                                    dkai.this.a();
                                }
                            });
                            ebzcVar2.findViewById(R.id.connected_text).setVisibility(8);
                        }
                    }, 500L);
                }
            }
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ftgj.c()) {
            Log.w("BugreportConsent", "Activity invoked but feature is disabled.");
            setResult(1);
            finish();
            return;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            Log.w("BugreportConsent", "Calling package is null");
        } else if (new dmbf(this).c(callingPackage)) {
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
            dkah dkahVar = new dkah(intent);
            this.k = dkahVar;
            if (!((Boolean) dkahVar.a.map(new Function() { // from class: dkaf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo464andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(!((String) obj).isEmpty());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(false)).booleanValue() || !((Boolean) this.k.b.map(new Function() { // from class: dkae
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo464andThen(Function function) {
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
            if (!((Boolean) this.k.c.map(new Function() { // from class: dkag
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo464andThen(Function function) {
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
                this.j = new djzn(this, new asmf(1, 9));
            }
            if (Log.isLoggable("BugreportConsent", 3)) {
                Log.d("BugreportConsent", "BugreportConsentDialogViewModel: initialize");
            }
            djzu djzuVar = (djzu) new jrh(this).a(djzu.class);
            dkah dkahVar2 = this.k;
            dkai dkaiVar = new dkai() { // from class: djzj
                @Override // defpackage.dkai
                public final void a() {
                    if (Log.isLoggable("BugreportConsent", 3)) {
                        Log.d("BugreportConsent", "onAllowButtonClicked");
                    }
                    BugreportConsentChimeraActivity.this.g(true);
                }
            };
            dkai dkaiVar2 = new dkai() { // from class: djzk
                @Override // defpackage.dkai
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
            dkai dkaiVar3 = new dkai() { // from class: djzl
                @Override // defpackage.dkai
                public final void a() {
                    if (Log.isLoggable("BugreportConsent", 3)) {
                        Log.d("BugreportConsent", "onSendingToWear");
                    }
                    BugreportConsentChimeraActivity.this.f();
                }
            };
            dkai dkaiVar4 = new dkai() { // from class: djzm
                @Override // defpackage.dkai
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
            dkai dkaiVar5 = new dkai() { // from class: djzc
                @Override // defpackage.dkai
                public final void a() {
                    if (Log.isLoggable("BugreportConsent", 3)) {
                        Log.d("BugreportConsent", "on consent flow failed");
                    }
                    final BugreportConsentChimeraActivity bugreportConsentChimeraActivity = BugreportConsentChimeraActivity.this;
                    bugreportConsentChimeraActivity.runOnUiThread(new Runnable() { // from class: djzh
                        @Override // java.lang.Runnable
                        public final void run() {
                            Dialog dialog;
                            BugreportConsentChimeraActivity bugreportConsentChimeraActivity2 = BugreportConsentChimeraActivity.this;
                            djzr a = bugreportConsentChimeraActivity2.a(false);
                            if (a != null) {
                                a.x();
                            }
                            if (Log.isLoggable("BugreportConsent", 3)) {
                                Log.d("BugreportConsent", "showRetryDialog");
                            }
                            djzr a2 = bugreportConsentChimeraActivity2.a(false);
                            if (a2 != null && a2.isAdded() && (dialog = a2.getDialog()) != null) {
                                dialog.hide();
                            }
                            djzy b = bugreportConsentChimeraActivity2.b(true);
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
            djzn djznVar = this.j;
            djzuVar.g = dkahVar2;
            djzuVar.b = dkaiVar;
            djzuVar.c = dkaiVar2;
            djzuVar.d = dkaiVar3;
            djzuVar.e = dkaiVar4;
            djzuVar.f = dkaiVar5;
            djzuVar.a = str2;
            djzuVar.h = djznVar;
            final djzd djzdVar = new djzd(this);
            new asmf(1, 9).execute(new Runnable() { // from class: djza
                @Override // java.lang.Runnable
                public final void run() {
                    final boolean z = !asnd.x(this).isEmpty();
                    final BugreportConsentChimeraActivity bugreportConsentChimeraActivity = djzdVar.a;
                    bugreportConsentChimeraActivity.runOnUiThread(new Runnable() { // from class: djzf
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
