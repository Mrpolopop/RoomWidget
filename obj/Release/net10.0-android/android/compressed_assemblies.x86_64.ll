; ModuleID = 'compressed_assemblies.x86_64.ll'
source_filename = "compressed_assemblies.x86_64.ll"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-unknown-linux-android21"

%struct.CompressedAssemblyDescriptor = type {
	i32, ; uint32_t uncompressed_file_size
	i1, ; bool loaded
	i32 ; uint32_t buffer_offset
}

@compressed_assembly_count = dso_local local_unnamed_addr constant i32 129, align 4

@compressed_assembly_descriptors = dso_local local_unnamed_addr global [129 x %struct.CompressedAssemblyDescriptor] [
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 0; uint32_t buffer_offset
	}, ; 0: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 15632; uint32_t buffer_offset
	}, ; 1: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 31264; uint32_t buffer_offset
	}, ; 2: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 46896; uint32_t buffer_offset
	}, ; 3: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 62568; uint32_t buffer_offset
	}, ; 4: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 78200; uint32_t buffer_offset
	}, ; 5: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 93832; uint32_t buffer_offset
	}, ; 6: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 109464; uint32_t buffer_offset
	}, ; 7: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 125096; uint32_t buffer_offset
	}, ; 8: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 140768; uint32_t buffer_offset
	}, ; 9: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 156400; uint32_t buffer_offset
	}, ; 10: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 172072; uint32_t buffer_offset
	}, ; 11: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 187744; uint32_t buffer_offset
	}, ; 12: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 203368; uint32_t buffer_offset
	}, ; 13: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 218992; uint32_t buffer_offset
	}, ; 14: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 234616; uint32_t buffer_offset
	}, ; 15: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 250240; uint32_t buffer_offset
	}, ; 16: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 265912; uint32_t buffer_offset
	}, ; 17: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 281584; uint32_t buffer_offset
	}, ; 18: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 297216; uint32_t buffer_offset
	}, ; 19: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 312840; uint32_t buffer_offset
	}, ; 20: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 328472; uint32_t buffer_offset
	}, ; 21: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 344104; uint32_t buffer_offset
	}, ; 22: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 359728; uint32_t buffer_offset
	}, ; 23: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 375352; uint32_t buffer_offset
	}, ; 24: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 390984; uint32_t buffer_offset
	}, ; 25: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 406608; uint32_t buffer_offset
	}, ; 26: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 422240; uint32_t buffer_offset
	}, ; 27: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 437912; uint32_t buffer_offset
	}, ; 28: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 453544; uint32_t buffer_offset
	}, ; 29: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 469168; uint32_t buffer_offset
	}, ; 30: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15632, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 484800; uint32_t buffer_offset
	}, ; 31: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 500432; uint32_t buffer_offset
	}, ; 32: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 15672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 516056; uint32_t buffer_offset
	}, ; 33: Microsoft.Maui.Controls.resources
	%struct.CompressedAssemblyDescriptor {
		i32 6144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 531728; uint32_t buffer_offset
	}, ; 34: _Microsoft.Android.Resource.Designer
	%struct.CompressedAssemblyDescriptor {
		i32 14848, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 537872; uint32_t buffer_offset
	}, ; 35: CommunityToolkit.Mvvm
	%struct.CompressedAssemblyDescriptor {
		i32 232960, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 552720; uint32_t buffer_offset
	}, ; 36: Ical.Net
	%struct.CompressedAssemblyDescriptor {
		i32 14848, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 785680; uint32_t buffer_offset
	}, ; 37: Microsoft.Extensions.Configuration
	%struct.CompressedAssemblyDescriptor {
		i32 6656, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 800528; uint32_t buffer_offset
	}, ; 38: Microsoft.Extensions.Configuration.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 46592, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 807184; uint32_t buffer_offset
	}, ; 39: Microsoft.Extensions.DependencyInjection
	%struct.CompressedAssemblyDescriptor {
		i32 26624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 853776; uint32_t buffer_offset
	}, ; 40: Microsoft.Extensions.DependencyInjection.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 8192, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 880400; uint32_t buffer_offset
	}, ; 41: Microsoft.Extensions.Diagnostics.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 7168, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 888592; uint32_t buffer_offset
	}, ; 42: Microsoft.Extensions.FileProviders.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 6144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 895760; uint32_t buffer_offset
	}, ; 43: Microsoft.Extensions.Hosting.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 17920, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 901904; uint32_t buffer_offset
	}, ; 44: Microsoft.Extensions.Logging
	%struct.CompressedAssemblyDescriptor {
		i32 19456, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 919824; uint32_t buffer_offset
	}, ; 45: Microsoft.Extensions.Logging.Abstractions
	%struct.CompressedAssemblyDescriptor {
		i32 16896, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 939280; uint32_t buffer_offset
	}, ; 46: Microsoft.Extensions.Options
	%struct.CompressedAssemblyDescriptor {
		i32 9216, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 956176; uint32_t buffer_offset
	}, ; 47: Microsoft.Extensions.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 1925384, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 965392; uint32_t buffer_offset
	}, ; 48: Microsoft.Maui.Controls
	%struct.CompressedAssemblyDescriptor {
		i32 133392, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 2890776; uint32_t buffer_offset
	}, ; 49: Microsoft.Maui.Controls.Xaml
	%struct.CompressedAssemblyDescriptor {
		i32 853504, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 3024168; uint32_t buffer_offset
	}, ; 50: Microsoft.Maui
	%struct.CompressedAssemblyDescriptor {
		i32 53760, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 3877672; uint32_t buffer_offset
	}, ; 51: Microsoft.Maui.Essentials
	%struct.CompressedAssemblyDescriptor {
		i32 208696, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 3931432; uint32_t buffer_offset
	}, ; 52: Microsoft.Maui.Graphics
	%struct.CompressedAssemblyDescriptor {
		i32 411648, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 4140128; uint32_t buffer_offset
	}, ; 53: NodaTime
	%struct.CompressedAssemblyDescriptor {
		i32 73728, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 4551776; uint32_t buffer_offset
	}, ; 54: Xamarin.AndroidX.Activity
	%struct.CompressedAssemblyDescriptor {
		i32 583680, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 4625504; uint32_t buffer_offset
	}, ; 55: Xamarin.AndroidX.AppCompat
	%struct.CompressedAssemblyDescriptor {
		i32 17920, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 5209184; uint32_t buffer_offset
	}, ; 56: Xamarin.AndroidX.AppCompat.AppCompatResources
	%struct.CompressedAssemblyDescriptor {
		i32 8704, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 5227104; uint32_t buffer_offset
	}, ; 57: Xamarin.AndroidX.Arch.Core.Common
	%struct.CompressedAssemblyDescriptor {
		i32 18944, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 5235808; uint32_t buffer_offset
	}, ; 58: Xamarin.AndroidX.CardView
	%struct.CompressedAssemblyDescriptor {
		i32 22528, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 5254752; uint32_t buffer_offset
	}, ; 59: Xamarin.AndroidX.Collection.Jvm
	%struct.CompressedAssemblyDescriptor {
		i32 78336, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 5277280; uint32_t buffer_offset
	}, ; 60: Xamarin.AndroidX.CoordinatorLayout
	%struct.CompressedAssemblyDescriptor {
		i32 605696, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 5355616; uint32_t buffer_offset
	}, ; 61: Xamarin.AndroidX.Core
	%struct.CompressedAssemblyDescriptor {
		i32 26624, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 5961312; uint32_t buffer_offset
	}, ; 62: Xamarin.AndroidX.CursorAdapter
	%struct.CompressedAssemblyDescriptor {
		i32 9728, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 5987936; uint32_t buffer_offset
	}, ; 63: Xamarin.AndroidX.CustomView
	%struct.CompressedAssemblyDescriptor {
		i32 47104, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 5997664; uint32_t buffer_offset
	}, ; 64: Xamarin.AndroidX.DrawerLayout
	%struct.CompressedAssemblyDescriptor {
		i32 236032, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6044768; uint32_t buffer_offset
	}, ; 65: Xamarin.AndroidX.Fragment
	%struct.CompressedAssemblyDescriptor {
		i32 23552, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6280800; uint32_t buffer_offset
	}, ; 66: Xamarin.AndroidX.Lifecycle.Common.Jvm
	%struct.CompressedAssemblyDescriptor {
		i32 18944, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6304352; uint32_t buffer_offset
	}, ; 67: Xamarin.AndroidX.Lifecycle.LiveData.Core
	%struct.CompressedAssemblyDescriptor {
		i32 32768, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6323296; uint32_t buffer_offset
	}, ; 68: Xamarin.AndroidX.Lifecycle.ViewModel.Android
	%struct.CompressedAssemblyDescriptor {
		i32 13824, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6356064; uint32_t buffer_offset
	}, ; 69: Xamarin.AndroidX.Lifecycle.ViewModelSavedState.Android
	%struct.CompressedAssemblyDescriptor {
		i32 39424, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6369888; uint32_t buffer_offset
	}, ; 70: Xamarin.AndroidX.Loader
	%struct.CompressedAssemblyDescriptor {
		i32 92672, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6409312; uint32_t buffer_offset
	}, ; 71: Xamarin.AndroidX.Navigation.Common.Android
	%struct.CompressedAssemblyDescriptor {
		i32 19456, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6501984; uint32_t buffer_offset
	}, ; 72: Xamarin.AndroidX.Navigation.Fragment
	%struct.CompressedAssemblyDescriptor {
		i32 65536, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6521440; uint32_t buffer_offset
	}, ; 73: Xamarin.AndroidX.Navigation.Runtime.Android
	%struct.CompressedAssemblyDescriptor {
		i32 27136, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6586976; uint32_t buffer_offset
	}, ; 74: Xamarin.AndroidX.Navigation.UI
	%struct.CompressedAssemblyDescriptor {
		i32 457728, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 6614112; uint32_t buffer_offset
	}, ; 75: Xamarin.AndroidX.RecyclerView
	%struct.CompressedAssemblyDescriptor {
		i32 12288, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 7071840; uint32_t buffer_offset
	}, ; 76: Xamarin.AndroidX.SavedState.SavedState.Android
	%struct.CompressedAssemblyDescriptor {
		i32 41984, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 7084128; uint32_t buffer_offset
	}, ; 77: Xamarin.AndroidX.SwipeRefreshLayout
	%struct.CompressedAssemblyDescriptor {
		i32 62976, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 7126112; uint32_t buffer_offset
	}, ; 78: Xamarin.AndroidX.ViewPager
	%struct.CompressedAssemblyDescriptor {
		i32 40448, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 7189088; uint32_t buffer_offset
	}, ; 79: Xamarin.AndroidX.ViewPager2
	%struct.CompressedAssemblyDescriptor {
		i32 172032, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 7229536; uint32_t buffer_offset
	}, ; 80: Xamarin.AndroidX.Work.Runtime
	%struct.CompressedAssemblyDescriptor {
		i32 675840, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 7401568; uint32_t buffer_offset
	}, ; 81: Xamarin.Google.Android.Material
	%struct.CompressedAssemblyDescriptor {
		i32 14848, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8077408; uint32_t buffer_offset
	}, ; 82: Xamarin.Google.Guava.ListenableFuture
	%struct.CompressedAssemblyDescriptor {
		i32 94720, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8092256; uint32_t buffer_offset
	}, ; 83: Xamarin.Kotlin.StdLib
	%struct.CompressedAssemblyDescriptor {
		i32 36864, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8186976; uint32_t buffer_offset
	}, ; 84: Xamarin.KotlinX.Coroutines.Core.Jvm
	%struct.CompressedAssemblyDescriptor {
		i32 91648, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8223840; uint32_t buffer_offset
	}, ; 85: Xamarin.KotlinX.Serialization.Core.Jvm
	%struct.CompressedAssemblyDescriptor {
		i32 106496, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8315488; uint32_t buffer_offset
	}, ; 86: RoomWidget
	%struct.CompressedAssemblyDescriptor {
		i32 25600, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8421984; uint32_t buffer_offset
	}, ; 87: System.Collections.Concurrent
	%struct.CompressedAssemblyDescriptor {
		i32 17408, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8447584; uint32_t buffer_offset
	}, ; 88: System.Collections.NonGeneric
	%struct.CompressedAssemblyDescriptor {
		i32 10752, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8464992; uint32_t buffer_offset
	}, ; 89: System.Collections.Specialized
	%struct.CompressedAssemblyDescriptor {
		i32 40448, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8475744; uint32_t buffer_offset
	}, ; 90: System.Collections
	%struct.CompressedAssemblyDescriptor {
		i32 11776, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8516192; uint32_t buffer_offset
	}, ; 91: System.ComponentModel.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 94720, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8527968; uint32_t buffer_offset
	}, ; 92: System.ComponentModel.TypeConverter
	%struct.CompressedAssemblyDescriptor {
		i32 5120, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8622688; uint32_t buffer_offset
	}, ; 93: System.ComponentModel
	%struct.CompressedAssemblyDescriptor {
		i32 12288, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8627808; uint32_t buffer_offset
	}, ; 94: System.Console
	%struct.CompressedAssemblyDescriptor {
		i32 40448, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8640096; uint32_t buffer_offset
	}, ; 95: System.Diagnostics.DiagnosticSource
	%struct.CompressedAssemblyDescriptor {
		i32 11776, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8680544; uint32_t buffer_offset
	}, ; 96: System.Drawing.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 5120, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8692320; uint32_t buffer_offset
	}, ; 97: System.Drawing
	%struct.CompressedAssemblyDescriptor {
		i32 60416, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8697440; uint32_t buffer_offset
	}, ; 98: System.Formats.Asn1
	%struct.CompressedAssemblyDescriptor {
		i32 22016, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8757856; uint32_t buffer_offset
	}, ; 99: System.IO.Compression.Brotli
	%struct.CompressedAssemblyDescriptor {
		i32 31744, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8779872; uint32_t buffer_offset
	}, ; 100: System.IO.Compression
	%struct.CompressedAssemblyDescriptor {
		i32 6144, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8811616; uint32_t buffer_offset
	}, ; 101: System.IO.Pipelines
	%struct.CompressedAssemblyDescriptor {
		i32 354816, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 8817760; uint32_t buffer_offset
	}, ; 102: System.Linq.Expressions
	%struct.CompressedAssemblyDescriptor {
		i32 73728, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9172576; uint32_t buffer_offset
	}, ; 103: System.Linq
	%struct.CompressedAssemblyDescriptor {
		i32 14336, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9246304; uint32_t buffer_offset
	}, ; 104: System.Memory
	%struct.CompressedAssemblyDescriptor {
		i32 126464, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9260640; uint32_t buffer_offset
	}, ; 105: System.Net.Http
	%struct.CompressedAssemblyDescriptor {
		i32 38912, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9387104; uint32_t buffer_offset
	}, ; 106: System.Net.Primitives
	%struct.CompressedAssemblyDescriptor {
		i32 7168, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9426016; uint32_t buffer_offset
	}, ; 107: System.Net.Requests
	%struct.CompressedAssemblyDescriptor {
		i32 5120, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9433184; uint32_t buffer_offset
	}, ; 108: System.Numerics.Vectors
	%struct.CompressedAssemblyDescriptor {
		i32 18432, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9438304; uint32_t buffer_offset
	}, ; 109: System.ObjectModel
	%struct.CompressedAssemblyDescriptor {
		i32 73728, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9456736; uint32_t buffer_offset
	}, ; 110: System.Private.Uri
	%struct.CompressedAssemblyDescriptor {
		i32 663040, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 9530464; uint32_t buffer_offset
	}, ; 111: System.Private.Xml
	%struct.CompressedAssemblyDescriptor {
		i32 9216, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10193504; uint32_t buffer_offset
	}, ; 112: System.Runtime.InteropServices
	%struct.CompressedAssemblyDescriptor {
		i32 5120, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10202720; uint32_t buffer_offset
	}, ; 113: System.Runtime.Loader
	%struct.CompressedAssemblyDescriptor {
		i32 79360, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10207840; uint32_t buffer_offset
	}, ; 114: System.Runtime.Numerics
	%struct.CompressedAssemblyDescriptor {
		i32 14848, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10287200; uint32_t buffer_offset
	}, ; 115: System.Runtime
	%struct.CompressedAssemblyDescriptor {
		i32 123904, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10302048; uint32_t buffer_offset
	}, ; 116: System.Security.Cryptography
	%struct.CompressedAssemblyDescriptor {
		i32 5120, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10425952; uint32_t buffer_offset
	}, ; 117: System.Text.Encoding.Extensions
	%struct.CompressedAssemblyDescriptor {
		i32 29696, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10431072; uint32_t buffer_offset
	}, ; 118: System.Text.Encodings.Web
	%struct.CompressedAssemblyDescriptor {
		i32 376832, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10460768; uint32_t buffer_offset
	}, ; 119: System.Text.Json
	%struct.CompressedAssemblyDescriptor {
		i32 334848, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 10837600; uint32_t buffer_offset
	}, ; 120: System.Text.RegularExpressions
	%struct.CompressedAssemblyDescriptor {
		i32 5120, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 11172448; uint32_t buffer_offset
	}, ; 121: System.Threading.Thread
	%struct.CompressedAssemblyDescriptor {
		i32 12288, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 11177568; uint32_t buffer_offset
	}, ; 122: System.Threading
	%struct.CompressedAssemblyDescriptor {
		i32 5120, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 11189856; uint32_t buffer_offset
	}, ; 123: System.Xml.ReaderWriter
	%struct.CompressedAssemblyDescriptor {
		i32 5120, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 11194976; uint32_t buffer_offset
	}, ; 124: System
	%struct.CompressedAssemblyDescriptor {
		i32 2043904, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 11200096; uint32_t buffer_offset
	}, ; 125: System.Private.CoreLib
	%struct.CompressedAssemblyDescriptor {
		i32 172032, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 13244000; uint32_t buffer_offset
	}, ; 126: Java.Interop
	%struct.CompressedAssemblyDescriptor {
		i32 21536, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 13416032; uint32_t buffer_offset
	}, ; 127: Mono.Android.Runtime
	%struct.CompressedAssemblyDescriptor {
		i32 2034176, ; uint32_t uncompressed_file_size
		i1 false, ; bool loaded
		i32 13437568; uint32_t buffer_offset
	} ; 128: Mono.Android
], align 16

@uncompressed_assemblies_data_size = dso_local local_unnamed_addr constant i32 15471744, align 4

@uncompressed_assemblies_data_buffer = dso_local local_unnamed_addr global [15471744 x i8] zeroinitializer, align 16

; Metadata
!llvm.module.flags = !{!0, !1}
!0 = !{i32 1, !"wchar_size", i32 4}
!1 = !{i32 7, !"PIC Level", i32 2}
!llvm.ident = !{!2}
!2 = !{!".NET for Android remotes/origin/release/10.0.1xx @ 01024bb616e7b80417a2c6d320885bfdb956f20a"}
!3 = !{!4, !4, i64 0}
!4 = !{!"any pointer", !5, i64 0}
!5 = !{!"omnipotent char", !6, i64 0}
!6 = !{!"Simple C++ TBAA"}
